package com.learning.java;

public class BinarySearch {

	private int mid;

	public int search(int array[], int searchNumber) {
		binarySearch(array,0,array.length,searchNumber);
		return mid;
	}

	public void binarySearch(int array[], int min, int max, int guess) {
		System.out.println("min:"+min);
		System.out.println("max:"+max);
		int mid = Math.round((min + max )/ 2);
		System.out.println("Mid:"+mid);
		int values = array[mid];
		System.out.println("values:"+values);
		if (values == guess) {
			this.mid = mid;
		} else if (values < guess) {
			binarySearch(array, mid+1,max, guess);
		} else {
			binarySearch(array,min,mid-1, guess);
		}

	}

}
