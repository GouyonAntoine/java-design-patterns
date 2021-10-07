package fr.diginamic.refactoring;

import java.time.LocalDateTime;

import fr.diginamic.singleton.utils.DateUtils;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {
	
	public static Reservation getInstance(String dateReservationStr, int nbPlaces,Client client,TypeReservation typeReservation) {
		
		// 1)Conversion de la date de réservation en LocalDateTime via DetailUtils (Ajout avec Tp_Grasp)
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
		
		// 2) création d'une réservation
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		
		// 3) calcul du montant total de la réservation via ReservationMontant (Ajout avec Tp_Grasp)
		reservation.setTotal(getReservationMontant(typeReservation, client, nbPlaces));

		// 4) Ajout de la réservation au client
		client.getReservations().add(reservation);
		
		return reservation;
	}

	public static double getReservationMontant(TypeReservation type, Client client, int nbPlaces) {
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			total = total*(1 - type.getReductionPourcent()/100.0);
		}
		return total;
	}
}