package com.Queue.Impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Queue {
	public static void main(String args[]) throws NumberFormatException, IOException{
		QueueImpl queue=new QueueImpl();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of List: ");
		queue.setSIZE(Integer.parseInt(br.readLine()));
		while(true){
			System.out.println("1.Enqueue \n2.Dequeue\n3.Display\n4.Quit \nEnter Choice: ");
			int ch=(Integer.parseInt(br.readLine()));
			switch(ch){
			case 1:
				System.out.println("Enter value to insert: ");
				String data=br.readLine();
				int result=queue.enqueue(data);
				break;
			case 2:				
				int result1=queue.dequeue();
				break;
			case 3:
				queue.display();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}
class QueueImpl{
	List l;
	int SIZE;
	QueueImpl(){
		l=new List();
		l.setHead(null);
		l.setRear(null);
		l.setCount(0);
		SIZE=10;
	}
	public int getSIZE() {
		return SIZE;
	}
	public void setSIZE(int sIZE) {
		SIZE = sIZE;
	}
	int enqueue(List l,Node n){
		if(l.getCount()<SIZE){
			
			if(l.getCount()==0){
				l.setHead(n);
				l.setRear(n);
			}
			else{
			n.setLink(l.getRear().getLink());
			l.getRear().setLink(n);
			l.setRear(n);
			}
			l.incCount(1);
			System.out.println("Element enqueue-ed: "+l.getRear().getData());
			return 1;
		}
		System.out.println("List Full");
		return -1;
	}
	//Delete Node
	int dequeue(List l){
		if(l.getCount()>0){
			l.decCount(1);
			System.out.println("Element dequeue-ed: "+l.getHead().getData());
			l.setHead(l.getHead().getLink());
			return 1;
		}
		System.out.println("List Empty");
		return -1;
	}
	//Traverse Nodes
	void display(List l){
		System.out.println("Count: "+l.getCount());
		Node n=l.getHead();
		if(n!=null){
		for(int i=0;i<l.getCount();i++){
			try{
				System.out.println(n.getData());
			}
			catch(Exception e){
				System.out.println("syso excepion");
			}
			
			n=n.getLink();
		}
		return;
		}
		System.out.println("List empty");
	}
	int enqueue(String data){
		Node n=new Node();
		n.setData(data);
		n.setLink(null);
		return enqueue(l,n);
	}
	int dequeue(){
		return dequeue(l);
	}
	void display(){
		display(l);
	}
}