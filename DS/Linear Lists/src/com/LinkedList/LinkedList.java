package com.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LinkedList {
	public static void main(String args[]) throws NumberFormatException, IOException{
		LinkedListImpl linked=new LinkedListImpl();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("1.Insert \n2.Delete \n3.Display\n4.Quit \nEnter Choice: ");
			int ch=(Integer.parseInt(br.readLine()));
			switch(ch){
			case 1:
				System.out.println("Enter value to insert: ");
				String data=br.readLine();
				System.out.println("Enter position to insert: ");
				int pos=Integer.parseInt(br.readLine());
				linked.insertNode(data,pos);
				break;
			case 2:
				System.out.println("Enter position to delete: ");
				int Dpos=Integer.parseInt(br.readLine());
				linked.deleteNode(Dpos);
				break;
			case 3:
				linked.display();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}
class LinkedListImpl{
	List linkedlist;
	
	
	public List getLinkedlist() {
		return linkedlist;
	}

	public void display() {
		// TODO Auto-generated method stub
		displayNodes(linkedlist);
		
	}

	public void deleteNode(int dpos) {
		// TODO Auto-generated method stub
		deleteNode(linkedlist,dpos);
		
	}

	public void setLinkedlist(List linkedlist) {
		this.linkedlist = linkedlist;
	}

		LinkedListImpl(){
		linkedlist=null;
		
	}
	
	//Insert Node
	void insertNode(List l,Node n, int pos){
			System.out.println("Entering insertNode with vlaues: "+pos);
		if (pos>l.getCount() || pos<0){
			System.out.println("Invalid position");
			return;
		}
		Node temp=l.getHead();
		for(int i=0;i<pos;i++){
			temp=temp.getLink();
			
		}
		n.setLink(temp.getLink());
		temp.setLink(n);
		l.incCount(1);
		if(pos==0){
			l.setHead(n);
		}
	}
	
	//Delete Node
	void deleteNode(List l,int pos){
		if (pos>l.getCount() || pos<0){
			System.out.println("Invalid position");
			return;
		}
		Node temp=l.getHead();
		for(int i=0;i<pos;i++){
			temp=temp.getLink();
			
		}
		l.decCount(1);
		
		temp.setLink(temp.getLink().getLink());
		if(pos==0){
			l.setHead(temp);
		}
	}
	//Traverse Nodes
	void displayNodes(List l){
		Node tempNode=l.getHead();
		for(int i=0;i<l.getCount();i++){
			System.out.println(tempNode.getData());
			
		}
	}
	void insertNode(String data,int pos){
		Node n=new Node();
		n.setData(data);
		n.setLink(null);
		insertNode(linkedlist,n,pos);
		
	}
}