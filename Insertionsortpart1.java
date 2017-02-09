package Hackerrankjavasolutions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 public class Insertionsortpart1 {
    
    

	    public static void insertIntoSorted(int[] ar){
	        
	        
	        //int ar=sc.nextInt();
	         //System.out.println(ar);
	        for(int i=ar.length-2;i>0;i--){
	           int j=ar.length-1;
	            int key=ar[j];
	             i=j-1;
	            while(i>=0 && ar[i]>key){
	                ar[i+1]=ar[i];
	                i=i-1;
	                
	                printArray(ar);
	            }
	         
	                
	            ar[i+1]=key;
	            printArray(ar);
	            break;
	        }
	              
	   // }
    }

    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        //printArray(ar);
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
            
        }
        insertIntoSorted(ar);
        //printArray(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
            
           }
            System.out.println("");
    
        }
        
    }

 



