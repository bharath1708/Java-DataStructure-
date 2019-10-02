package com.learning.java;

import java.util.Arrays;

public class CustomBubbleSort {

	public void sortMe(int[] array) {

		for (int i = 0; i < array.length; i++) {
			
			boolean isSwapped=false;
			
			for (int j = 0; j < array.length - 1; j++) {
		
				if (array[j] > array[j + 1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					isSwapped=true;
				}

			}
			
			System.out.println(Arrays.toString(array));
			if(!isSwapped)
				break;
			
		}



	}

}
