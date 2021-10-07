package fr.diginamic.state;

import fr.diginamic.state.etat.AvionAuSol;
import fr.diginamic.state.etat.AvionEnApproche;
import fr.diginamic.state.etat.AvionEnVol;

public class DemoAvion {

	public static void main(String[] args) {

		/*
		Avion avion = new Avion();
		avion.setEtat("AU SOL");
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat("EN VOL");
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat("EN APPROCHE");
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();

		*/

		Avion avion = new Avion();
		avion.setEtat(new AvionAuSol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat(new AvionEnVol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat(new AvionEnApproche());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();

	}

}