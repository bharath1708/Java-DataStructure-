package com.learning.java;

import java.util.LinkedList;

public class CustomQueue<T> {
	private LinkedList<T> list = new LinkedList<T>();

	public void push(T element) {
		list.add(element);
	}

	public void pop() {
		list.removeFirst();
	}
	
	public void showAll() {
		list.forEach(System.out::println);
	}
}
