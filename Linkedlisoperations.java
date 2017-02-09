package linkedlist;

public class Linkedlisoperations {
	static Node head;// this is first node in linked list

	Linkedlisoperations() {// we have to make first node null
		head = null;
	}

	public void insertertionOfNewNodeatFirstOfinLinkedList(int data)
	// insertion of node at first position
	{

		Node insertednewnode = new Node(data);// we take a new node as inserted
												// node

		insertednewnode.next = head;// head will shift to next of inserted node
		head = insertednewnode;// insertednewnode will be head of linked list
	}

	public Node deletionAtFirstPosition()// deletion of first node
	{
		Node temporarynamofnode = head;// two names of first node
		head = head.next;
		return temporarynamofnode;// delete this node and return
	}

	public boolean delete() {
		if (head == null)
			return false;
		head = head.next;
		return true;
	}

	public void displayoflinkedlist()// display of linked list
	{
		System.out.println("List(first->last)");
		Node current = head;// take a current pointer as head of linked list
		while (current != null)// until end of linked list
		{
			current.displayNode();// call method from Node class
			current = current.next;// shift current to next node
		}
	}

	public Node searhaNodeinList(int key) {
		Node current = head;// current pointer start from head of linked list
		while (current.data != key)// until end of linked list
		{
			if (current.next == null)// end of linked list
			{
				return null;// not found key
			} else {
				current = current.next;// move current pointer to next node
			}

		}
		return current;// return found node
	}

	public Node deletionOfGivenNodeData(int key) {
		Node current = head;// start a pointer from head of linked list
		Node previous = head;// for deletion we need to know previous node
		while (current.data != key)// until give key found
		{
			if (current.next == null)// if Key not found
				return null;// return null
			else
				previous = current;// previous node will become current
			current = current.next;// current become next node
		}
		if (current == head)// if found is head node of linked list
		{
			head = head.next;// move head to next node
		} else {
			previous.next = current.next;// move pointer of previous node to
											// poiner of current node
		}
		return current;// delete found node
	}

	public void deletedulpicate() {
		if (head == null)
			return;
		Node current = head;
		while (current != null)// until end of linked list
		{
			Node runner = current;// start a pointer current from head of linked
									// list
			while (runner.next != null) {

				if (runner.next.data == current.data)// if two nodes have same
														// data
				{
					runner.next = runner.next.next;// then make pointer same for
													// both nodes
				} else {
					runner = runner.next;// otherwise increase pointer to next
											// node

				}
			}
			current = current.next;// iterate through end of linked list and
									// shift head pointer
		}
	}

	public  Node kthLastElementOfLinkedList(int k)
	/* if k=2then we have to find out 2nd last element of list*/
	{
		if (head == null || k <= 0) // if head is null and K is negative number
			return null;
		
		Node current = head;//start both pointers from head
		Node previous = head;
		for (int i = 0; i < k-1; i++) //iterate first pointer till k
		{
			if (current == null)
				return null;
			current = current.next;//increase pointer
		}
		

		while (current.next != null)//untill last element
		{
			previous = previous.next;//increase both pointers from same speed
			current = current.next;

		}
		return previous;
				
	}

	public static void main(String[] args) {
		Linkedlisoperations newnode = new Linkedlisoperations();
		newnode.insertertionOfNewNodeatFirstOfinLinkedList(1);
		newnode.insertertionOfNewNodeatFirstOfinLinkedList(2);
		newnode.insertertionOfNewNodeatFirstOfinLinkedList(4);
		newnode.insertertionOfNewNodeatFirstOfinLinkedList(6);
		newnode.insertertionOfNewNodeatFirstOfinLinkedList(1);
		newnode.insertertionOfNewNodeatFirstOfinLinkedList(6);
		newnode.displayoflinkedlist();
		newnode.deletedulpicate();
		newnode.displayoflinkedlist();
		Node n=newnode.kthLastElementOfLinkedList(3);
		System.out.println("kth to last element from last is " + n.data);
		
		//newnode.displayoflinkedlist();
		//newnode.deletionAtFirstPosition();
		//newnode.insertertionOfNewNodeatFirstOfinLinkedList(7);
		//newnode.deletionOfGivenNodeData(6);
		//newnode.displayoflinkedlist();
	}
}
