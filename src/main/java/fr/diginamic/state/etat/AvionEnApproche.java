package fr.diginamic.state.etat;

public class AvionEnApproche implements AvionEtat {

	@Override
	public void rentrerTrainAtterrissage() {
		System.out.println("Nous allons atterrir. Il est impossible de rentrer le train d'atterrissage.");
	}

	@Override
	public void sortirTrainAtterrissage() {
		System.out.println("Nous allons atterrir. Le train d'atterrissage est sorti.");
	}

}
