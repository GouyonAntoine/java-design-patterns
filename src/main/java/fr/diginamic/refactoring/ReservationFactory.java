package fr.diginamic.refactoring;

import java.time.LocalDateTime;

import fr.diginamic.singleton.utils.DateUtils;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {
	
	public static Reservation getInstance(
			String dateReservationStr, 
			int nbPlaces,
			Client client,
			TypeReservation typeReservation
		) {
		
		//Conversion de la date de réservation en LocalDateTime via DetailUtils (Ajout avec Tp_Grasp)
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
		
		//création d'une réservation
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		
		//calcul du montant total de la réservation via ReservationMontant (Ajout avec Tp_Grasp)
		reservation.setTotal(ReservationCalcul.getReservationMontant(typeReservation, client, nbPlaces));
		
		//Ajout de la réservation au client
		client.getReservations().add(reservation);

		return reservation;
	}
}