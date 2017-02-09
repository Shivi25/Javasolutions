package linkedlist;

public class Node {
	int data;// data in node
	Node next;//name of node
	Node(int data){
		this.data=data;
		 next=null;
		
	}
	public void displayNode(){
		System.out.println("{" +data+ "}");
	}
	

}
