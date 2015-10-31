package com.LinkedList;

public class List {
	int count;
	Node head;
	Node prev,next;
	public List(){
		count=0;
		head=new Node();
		prev=null;next=null;
	}
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public void incCount(int count) {
		this.count+= count;
	}
	public void decCount(int count) {
		this.count-= count;
	}
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	//Insert Node
	//Delete Node
	//Traverse Nodes
}
