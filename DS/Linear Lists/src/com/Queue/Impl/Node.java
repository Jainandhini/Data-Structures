package com.Queue.Impl;

public class Node {
	String data;
	Node link;
	
public Node(){
	data="";
	link=null;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public Node getLink() {
	return link;
}

public void setLink(Node link) {
	this.link = link;
}

}
