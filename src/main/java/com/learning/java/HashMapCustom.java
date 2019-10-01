package com.learning.java;

class LinkedList {
	String key;
	String value;
	Entry next;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Entry getNext() {
		return next;
	}

	public void setNext(Entry next) {
		this.next = next;
	}

}

public class HashMapCustom {

	private int SIZE_FACTOR = 30;
	Entry[] bucket = new Entry[SIZE_FACTOR];

	public void add(String key, String value) {
		final int hashCode = hashcode(key);
		boolean isChanged=false;
		System.out.println(hashCode);
		if (bucket[hashCode] == null) {
			bucket[hashCode] = new Entry(key, value);
		} else {
			Entry entry = bucket[hashCode];
			if (entry.getK().equals(key)) {
				entry.setV(value);
			} else {
				while (entry.getNext() != null) {

					if (entry.getK().equals(key)) {
						entry.setV(value);
						isChanged=true;
						break;
					} else {
						entry = entry.getNext();
					}

				}
				if(isChanged)
				entry.setNext(new Entry(key, value));
				bucket[hashCode] = entry;
			}

		}

	}

	private int hashcode(String input) {
		return Math.abs(input.hashCode() % SIZE_FACTOR);

	}

	public void show() {

		for (int i = 0; i < this.bucket.length; i++) {
			Entry entry = this.bucket[i];
			if (entry != null) {
				while (entry.getNext() != null) {
					System.out.println("Key:" + entry.getK() + "  Value:" + entry.getV());
					entry = entry.getNext();
				}

				System.out.println("Key:" + entry.getK() + "  Value:" + entry.getV());
			}

			System.out.println();
		}
	}

}
