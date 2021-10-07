package fr.diginamic.composite.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Service implements IComponent{

	//Attribut
	private String nom;
    private List<IComponent> employesServices = new ArrayList<>();
	
	//Constructeur
	public Service() {
	}

	//Méthode
	@Override
	public Double calculerSalaire() {
		return this.employesServices.stream().mapToDouble(element -> element.calculerSalaire()).sum();
	}

	
	public List<IComponent> getEmployesServices() {
		return this.employesServices;
	}


	public void setEmployesServices(List<IComponent> employesServices) {
		this.employesServices = employesServices;
	}
}