package com.learning.java;



public class CustomMergeSort {

	public int[] sortMe(int[] array) {

		if (array.length <= 1) {
			return array;
		}

		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right;
		if (array.length % 2 == 0)
			right = new int[mid];
		else
			right = new int[mid + 1];

		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}

		for (int i = 0; i < right.length; i++) {
			right[i] = array[mid + i];
		}

		int[] result = new int[array.length];

		left = sortMe(left);
		right = sortMe(right);
		result = mergeLeftRight(left, right);
		return result;

	}

	private int[] mergeLeftRight(int[] left, int[] right) {

		int[] result = new int[left.length + right.length];
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;

		while (leftPointer < left.length || rightPointer < right.length) {
			if (leftPointer < left.length && rightPointer < right.length) {
				if (left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				} else {
					result[resultPointer++] = right[rightPointer++];
				}

			} else if (leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}

		}

		return result;
	}

}
