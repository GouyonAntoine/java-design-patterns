package fr.diginamic.strategy.factories;

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
