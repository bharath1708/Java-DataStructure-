package com.learning.java;

public class CustomBinarySearch {

	public static int search(int[] array, int min, int max, int value) {

		if (max >= min) {
			int mid = (min + max) / 2;
			if (array[mid] == value)
				return mid;

			if (array[mid] > value)
				return search(array, min, mid - 1, value);
			else
				return search(array, mid + 1, array.length, value);

		} else
			return -1;
	}

}
