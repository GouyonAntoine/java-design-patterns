package fr.diginamic.composite.interfaces;

public class Employe implements IComponent{
    private Double salaire;
	
	public Employe(Double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public Double calculerSalaire() {
		return this.salaire;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
}
