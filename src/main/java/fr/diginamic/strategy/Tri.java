package fr.diginamic.strategy;

import fr.diginamic.strategy.factories.StrategyFactory;
import fr.diginamic.strategy.interfaces.IStrategy;
import fr.diginamic.strategy.typeTri.TypeTri;

public class Tri {

	public void exec(TypeTri typeTri, Integer[] arr) {
		IStrategy methodeTri = StrategyFactory.getInstance(typeTri);
		methodeTri.trier(arr);
	}
}
