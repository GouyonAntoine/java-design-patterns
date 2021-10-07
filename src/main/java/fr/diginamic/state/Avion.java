package fr.diginamic.state;

import fr.diginamic.state.etat.AvionEtat;

public class Avion {

	private AvionEtat etat;
	private String etatTrain;
	
	/*
	public void rentrerTrainAtterrissage() {
		if (etat.equals("AU SOL")) {
			System.out.println("L'avion est au sol. Il est impossible de rentrer le train d'atterrissage.");
		}
		else if (etat.equals("EN VOL")) {
			System.out.println("Train d'atterrissage rentré.");
		}
		else if (etat.equals("EN APPROCHE")) {
			System.out.println("Nous allons atterrir. Il est impossible de rentrer le train d'atterrissage.");
		}
	}
	
	public void sortirTrainAtterrissage() {
		if (etat.equals("AU SOL")) {
			System.out.println("L'avion est au sol. Le train d'atterrissage est déjà sorti.");
		}
		else if (etat.equals("EN VOL")) {
			System.out.println("L'avion est en vol. Il est interdit de sortir le train d'atterrissage.");
		}
		else if (etat.equals("EN APPROCHE")) {
			System.out.println("Nous allons atterrir. Le train d'atterrissage est sorti.");
		}
	} */

	/** Getter
	 * @return the etat
	 */
	public AvionEtat getEtat() {
		return etat;
	}

	/** Setter
	 * @param etat the etat to set
	 */
	public void setEtat(AvionEtat etat) {
		this.etat = etat;
	}

	public void rentrerTrainAtterrissage() {
		this.etat.rentrerTrainAtterrissage();
	}
	
	public void sortirTrainAtterrissage() {
		this.etat.sortirTrainAtterrissage();
	}
}