package com.learning.java;

public class CustomHashMap  {

	private int size = 30;
	private Entry[] table = new Entry[size];

	public void put(String k, String v) {
		int hashCode = hashCode(k);
		System.out.println("Hash code:"+hashCode);
		Entry entry = new Entry(k, v);
		if (table[hashCode] == null)
		{	table[hashCode] = entry;
		
		}
		else { 
		
			Entry entryNotNull = table[hashCode];

			while (entryNotNull.getNext() != null) {
				
				
				entryNotNull = entryNotNull.getNext();
			}
			
			entryNotNull.setNext(entry);
			
			table[hashCode]=entryNotNull;
		}

	}

	private int hashCode(String k) {
		return k.hashCode() % size;

	}

	public void show() {

		for (int i = 0; i < this.table.length; i++) {
			Entry entry = this.table[i];
			if (entry != null) {
			while (entry.getNext() != null) {
					System.out.println("Key:"+entry.getK() +"  Value:"+entry.getV());
					entry = entry.getNext();
					}
				
				System.out.println("Key:"+entry.getK() +"  Value:"+entry.getV());
			}

			System.out.println();
		}
	}

}
