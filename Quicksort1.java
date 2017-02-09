package Hackerrankjavasolutions;
import java.util.*;
public class Quicksort1 {
	
	
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
		      //ArrayList ar=new ArrayList();
		           Scanner in = new Scanner(System.in);
		           int n = in.nextInt();
		           int[] ar = new int[n];
		           for(int i=0;i<n;i++){
		              ar[i]=in.nextInt(); 
		             // ArrayList<Integer> arr=new ArrayList<Integer>();
		             //ar.add(n);

		           }
		//arr.partition(ar)   ;      
		           partition(ar);
		          printArray(ar);
		      }    
		      


	
	static void partition(int[] ar) {
	    int temp=0;
	    int pivot=ar[0];
	    int pIndex=ar.length-1;
	    for(int i=ar.length-1;i>=1;i--){
	        if(ar[i]>=pivot){
	            temp=ar[i];
	            ar[i]=ar[pIndex];
	            ar[pIndex]=temp;
	            pIndex=pIndex-1;
	           // printArray(ar);
	        }
	       
	    }
	    
	    temp=ar[pIndex];
	    ar[pIndex]=ar[0];
	    ar[0]=temp;
	    //7
	   // printArray(ar); 
	}
	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }

}
