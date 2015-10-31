package com.Queue.Impl;

public class List {
	int count;
	Node head;
	Node rear;
	
	public List(){
		count=0;
		head=null;
		rear=null;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
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
