package fr.diginamic.composite.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Service implements IComponent{
    private List<IComponent> employesServices = new ArrayList<>();
	
	
	public Service() {
	}


	@Override
	public Double calculerSalaire() {
		return this.employesServices.stream().mapToDouble(e -> e.calculerSalaire()).sum();
	}

	
	public List<IComponent> getEmployesServices() {
		return employesServices;
	}


	public void setEmployesServices(List<IComponent> employesServices) {
		this.employesServices = employesServices;
	}
}