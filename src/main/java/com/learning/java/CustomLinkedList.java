package com.learning.java;

class Node {

	private String data;
	private Node node;

	public Node getNextNode() {
		return this.node;
	}

	Node(String data) {
		this.data = data;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public String getData() {
		return this.data;
	}

}

public class CustomLinkedList {

	private Node node;

	public void add(String data) {
		Node rooNode = this.node;

		if (this.node == null) {
			this.node = new Node(data);
		} else {

			while (null != this.node.getNextNode()) {

				this.node = this.node.getNextNode();
			}

			this.node.setNode(new Node(data));
			this.node = rooNode;
		}

	}

	public void remove(String data) {
		Node rooNode = this.node;

		while (!this.node.getData().equals(data)) {
			this.node = this.node.getNextNode();
		}
		this.node=this.node.getNextNode();
//		this.node = rooNode;
	}

	public void printAll() {
		Node rooNode = this.node;
		while (this.node.getNextNode() != null) {
			System.out.println(">>>>>>>>>>>>>>" + this.node.getData());
			this.node = this.node.getNextNode();
		}
		System.out.println(">>>>>>>>>>>>>>" + this.node.getData());
		this.node = rooNode;

	}

}
