package com.learning.java;

public class CustomLinearSearch {

	public static int search(int[] array, int value) {
		int possition = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				possition = i;
				break;
			}

		}
		return possition;
	}

}
