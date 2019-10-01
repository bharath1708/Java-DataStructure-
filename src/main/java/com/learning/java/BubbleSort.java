package com.learning.java;

public class BubbleSort {

	public void sort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

	}
	public void print(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println("==>" + array[i]);

		}
	}

}
