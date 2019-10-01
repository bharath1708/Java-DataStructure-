package com.learning.java;

public class SelectionSort {

	
	public int[] sort(int[] array) {

		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j <= array.length-1; j++) {
				if(array[i] >= array[j]) {
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;

				}
			
			}
			
		}
		return array;
		
	}
}
