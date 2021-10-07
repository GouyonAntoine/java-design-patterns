package fr.diginamic.state.etat;

public class AvionEnVol implements AvionEtat {

	@Override
	public void rentrerTrainAtterrissage() {
		System.out.println("Train d'atterrissage rentré.");
	}

	@Override
	public void sortirTrainAtterrissage() {
		System.out.println("L'avion est en vol. Il est interdit de sortir le train d'atterrissage.");
	}

}