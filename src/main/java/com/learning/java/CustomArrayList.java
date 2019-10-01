package com.learning.java;

public class CustomArrayList {

	int maxSixe = 3;
	int currentSize = 0;
	String[] myArray = new String[this.maxSixe];

	public void add(String element) {
		final int lengthArray = this.myArray.length - 1;
		if (this.currentSize == this.maxSixe) {
			this.copyArray(element);
		} else {
			this.myArray[currentSize] = element;
			this.currentSize++;
		}
	}

	public void copyArray(String element) {

		this.maxSixe = this.maxSixe * 2;
		String[] tempArray = new String[this.maxSixe];
		for (int i = 0; i < this.myArray.length; i++) {
			tempArray[i] = this.myArray[i];
		}
		this.myArray = new String[this.maxSixe];
		this.myArray = tempArray;
		add(element);
	}

	public void reomve(String element) {

		for (int i = 0; i < this.myArray.length; i++) {
			if (this.myArray[i].equals(element)) {
				this.shiftArray(i);
				break;
			}
		}
	}

	public void shiftArray(int placeHolder) {

		for (int i = placeHolder; i < this.myArray.length - 1; i++) {
			this.myArray[i] = this.myArray[i + 1];
		}

	}

	public void printAll() {

		for (int i = 0; i < this.myArray.length; i++) {
			 System.out.println(">>>>>>>>"+this.myArray[i]);
		}
	}

}
