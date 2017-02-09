package linkedlist;
import java.util.*;

public class Mthtolastelement {

	public static void main(String[] args) {
		

		

			Scanner sc = new Scanner(System.in);
			int K=sc.nextInt();
			sc.nextLine();
			
			LinkedList l=new LinkedList();
				while(sc.hasNext()){
					l.add(sc.nextInt());
				}
				   l.add(null);
				 
					ListIterator itr=l.listIterator();
					int n=l.size();
					Object current=l.getFirst();
					Object previous=l.getFirst();
					int m=0;
					int j=0;
				   //if(n==null || K<=0)
					//return NULL;
					for(int i=0;i<K-1;i++){
						m++;
						j++;
						
							
					}
						//if(i==null)
							
						//i++;	
					while(l.get(i)!=null){
						
						
					}
					
				
				
			}
		    
			
		
		// TODO Auto-generated method stub
	public static  Node kthLastElementOfLinkedList(int k)
	/* if k=2then we have to find out 2nd last element of list*/
	{
		Node head = null;
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
	}


