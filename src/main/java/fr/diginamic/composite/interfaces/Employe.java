package fr.diginamic.composite.interfaces;

public class Employe implements IComponent{

    private Double salaire;
	private String nom;
	private String prenom;
	
	public Employe(Double salaire) {
		this.salaire = salaire;
	}

	//get et set
	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	

	@Override
	public Double calculerSalaire() {
		//return this.salaire;
		return this.getSalaire();
	}
}
