package fr.diginamic.composite.test_composite;


import fr.diginamic.composite.interfaces.Employe;
import fr.diginamic.composite.interfaces.IComponent;
import fr.diginamic.composite.interfaces.Service;

public class TestComposite {

	public TestComposite() {
	}

	public static void main(String[] args) {

            //les petits profs
			Service diginamic = new Service();
			IComponent herve = new Employe(5000.0);
			IComponent lionel = new Employe(6000.0);
			diginamic.getEmployesServices().add(herve);
			diginamic.getEmployesServices().add(lionel);
			
            //les futurs milliardaires
			Service etudiant = new Service();
			IComponent tanguy = new Employe(7500.0);
			IComponent mathis = new Employe(7500.0);
			etudiant.getEmployesServices().add(tanguy);
			etudiant.getEmployesServices().add(mathis);
			
            //le feignant du fond
			Service feignant = new Service();
			IComponent antoine = new Employe(75000.0);
			feignant.getEmployesServices().add(antoine);
			
			diginamic.getEmployesServices().add(etudiant);
			diginamic.getEmployesServices().add(feignant);
			
			System.out.println("Le salaire de tous les acteurs de Diginamics réunis est => " + diginamic.calculerSalaire());
	}

}
