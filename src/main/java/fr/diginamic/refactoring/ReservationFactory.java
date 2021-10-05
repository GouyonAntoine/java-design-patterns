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
		
		//Conversion de la date de rÃ©servation en LocalDateTime
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
		
		//création de la réservation
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		
		//calcul du montant total
		reservation.setTotal(ReservationCalcul.getReservationAmount(typeReservation, client, nbPlaces));
		
		//Ajout de la rÃ©servation au client
		client.getReservations().add(reservation);

		return reservation;
	}
}