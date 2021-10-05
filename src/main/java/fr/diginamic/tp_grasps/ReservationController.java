package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import fr.diginamic.refactoring.ReservationFactory;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {
	
	/** formatter */
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	/** DAO permettant d'accéder à la table des clients */
	private ClientDao clientDao = new ClientDao();
	
	/** DAO permettant d'accéder à la table des types de réservation */
	private TypeReservationDao typeReservationDao = new TypeReservationDao();
	
	/** Méthode qui créée une réservation pour un client à partir des informations transmises
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {
		
		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();

		// 2) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);
		
		// 3) Extraction de la base de données des infos concernant le type de la réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);
		
		// 4) Création de la réservation
		return ReservationFactory.getInstance(dateReservationStr, nbPlaces, client, type);
	}
}
