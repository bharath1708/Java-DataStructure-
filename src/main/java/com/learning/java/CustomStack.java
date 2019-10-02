package com.learning.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class CustomStack {
	private int intialSize = 10;
	String[] stackArray;
	int currentStackSize = 0;

	CustomStack() {
		this.stackArray = new String[this.intialSize];
	}

	public void push(String data) {

		if (this.currentStackSize == intialSize)
			grow();
		this.stackArray[this.currentStackSize] = data;
		this.currentStackSize++;
	}

	private void grow() {

		this.intialSize = this.intialSize * 2;
		String[] tempStack =  Arrays.copyOf(this.stackArray,this.intialSize);
		this.stackArray = new String[this.intialSize];
		this.stackArray =tempStack;

	}

	public void pop() {
		this.stackArray[--this.currentStackSize] = null;
		this.currentStackSize--;
	}

	public void showAll() {

		for (int i = 0; i <= this.currentStackSize; i++) {

			System.out.println("Data :: " + this.stackArray[i]);

		}

	}
}
