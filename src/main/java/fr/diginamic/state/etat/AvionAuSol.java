package fr.diginamic.state.etat;

public class AvionAuSol implements AvionEtat {
	@Override
	public void rentrerTrainAtterrissage() {
		System.out.println("L'avion est au sol. Il est impossible de rentrer le train d'atterrissage.");
	}

	@Override
	public void sortirTrainAtterrissage() {
		System.out.println("L'avion est au sol. Le train d'atterrissage est déjà sorti.");
	}

}
