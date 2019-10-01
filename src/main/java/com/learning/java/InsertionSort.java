package com.learning.java;

public class InsertionSort {

	public void sort(int[] arr) {
		 int n = arr.length; 
	        for (int i = 1; i < n; ++i) { 
	            int key = arr[i]; 
	            int j = i - 1; 
	            System.out.println("key:"+key);
	            System.out.println("i:"+i);
	            System.out.println("j:"+j);
	            while (j >= 0 && arr[j] > key) { 
	                arr[j + 1] = arr[j]; 
	                j = j - 1;             
	            } 
	            arr[j + 1] = key; 
	        } 

		}


}
