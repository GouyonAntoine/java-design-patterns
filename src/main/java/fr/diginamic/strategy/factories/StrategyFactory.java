package fr.diginamic.strategy.factories;

import fr.diginamic.strategy.interfaces.IStrategy;
import fr.diginamic.strategy.typeTri.TriBubble;
import fr.diginamic.strategy.typeTri.TriInsertion;
import fr.diginamic.strategy.typeTri.TriSelection;
import fr.diginamic.strategy.typeTri.TypeTri;

public class StrategyFactory {
	
    public static IStrategy getInstance(TypeTri typeTri) {
		switch(typeTri) {
		case bubble: return new TriBubble(); 
		case insertion: return new TriInsertion();
		case selection: return new TriSelection();
		}
		return null;
	}
}
