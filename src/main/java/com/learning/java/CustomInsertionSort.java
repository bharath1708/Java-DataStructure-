package com.learning.java;

import java.util.Arrays;

public class CustomInsertionSort {

	public void sortMe(int[] array) {

		for (int i = 0; i < array.length-1; i++) {

			for (int j = i; j >= 0 && array[j] > array[j+1]; j--) {
				int temp = array[j+1];
				array[j+1] = array[j];
				array[j] = temp;
			}

		}
		System.out.println(Arrays.toString(array));
	}

}
