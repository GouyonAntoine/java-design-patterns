package fr.diginamic.strategy.typeTri;

import fr.diginamic.strategy.interfaces.IStrategy;

public class TriSelection implements IStrategy {

	@Override
	public void trier(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
	}

}
