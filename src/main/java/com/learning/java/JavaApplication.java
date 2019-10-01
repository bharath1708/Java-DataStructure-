package com.learning.java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class JavaApplication {

	public static void main(String[] args) {

//		CustomArrayList custArrayList = new CustomArrayList();
//		custArrayList.add("Bharath");
//		custArrayList.add("Kumar");
//		custArrayList.add("s");
//		custArrayList.add("v");
//		custArrayList.reomve("Bharath");
//		custArrayList.printAll();

		CustomLinkedList custLinkedList=new CustomLinkedList();
		custLinkedList.add("Bharath");
		custLinkedList.add("Kumar");
		custLinkedList.add("s");
		custLinkedList.add("v");
		custLinkedList.remove("Kumar");
		custLinkedList.printAll();
	}

	

}
