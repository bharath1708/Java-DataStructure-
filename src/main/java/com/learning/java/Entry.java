package com.learning.java;

public class Entry {

	private String k;
	private String V;
	private Entry next;

	public Entry(String k, String v) {
		this.k=k;
		this.V=v;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getV() {
		return V;
	}

	public void setV(String v) {
		V = v;
	}

	public Entry getNext() {
		return next;
	}

	public void setNext(Entry next) {
		this.next = next;
	}

}
