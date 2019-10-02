package com.learning.java;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class JavaApplication {

	public static void main(String[] args) {

//		CustomArrayList custArrayList = new CustomArrayList();
//		custArrayList.add("Bharath");
//		custArrayList.add("Kumar");
//		custArrayList.add("s");
//		custArrayList.add("v");
//		custArrayList.reomve("Bharath");
//		custArrayList.printAll();
//
//		CustomLinkedList custLinkedList=new CustomLinkedList();
//		custLinkedList.add("Bharath");
//		custLinkedList.add("Kumar");
//		custLinkedList.add("s");
//		custLinkedList.add("v");
//		custLinkedList.remove("s");
//		custLinkedList.printAll();
		
//		CustomStack stack=new CustomStack();
//		stack.push("Bharath");
//		stack.push("Kumar");
//		stack.push("s");
//		stack.push("v");
//		stack.push("Bharath");
//		stack.push("Kumar");
//		stack.push("s");
//		stack.push("v");
//		stack.push("Bharath");
//		stack.push("Kumar");
//		stack.push("s");
//		stack.push("v");
//		stack.showAll();
//		System.out.println("*******************");
//		stack.pop();
//		stack.showAll();
//		
		
		
//	HashMapCustom hashMap=new HashMapCustom();
//	hashMap.add("Bharath1","Kumar");
//	hashMap.add("Bharath5","Kumar111111111");
//	hashMap.add("Bharath2","Kumar");
//	hashMap.add("Bharath3","Kumar");
//	hashMap.show();
	
//		CustomQueue<String> queue=new CustomQueue<String>();
//		queue.push("Bharath1");
//		queue.push("Bharath2");	
//		queue.push("Bharath3");	
//		queue.push("Bharath4");	
//		queue.push("Bharath5");
//		queue.push("Bharath6");
//		queue.showAll();
//		System.out.println("*************");
//		queue.pop();
//		queue.showAll();

		
		int[] array= {6,5,10,1,1000,7,2,4,3,0};
		
//		CustomBubbleSort sort=new CustomBubbleSort();
//		
//		sort.sortMe(array);
		
//		CustomInsertionSort sortInsertion=new CustomInsertionSort();
//		sortInsertion.sortMe(array);
		
		CustomMergeSort sortMerge=new CustomMergeSort();
		array=sortMerge.sortMe(array);
		System.out.println(Arrays.toString(array)); 
		
	}

	

}
