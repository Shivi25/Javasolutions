package Hackerrankjavasolutions;
import java.io.*;
import java.util.Scanner;
public class Countingsort {
	
	
	/*public static int[] countingSort(int[] a,int k){
		int c[]=new int[k];
		for(int i=1;i<a.length-1;i++){
			c[a[i]]++;
			
			
			
		}
		return c;
		
	}*/
	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		//System.out.println();
	}
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] ar = new int[n];
	for(int i=0;i<n;i++){
		//ar[i]=in.nextInt();
		//int ar;
		int c[]=new int[100];
		for(int j=0;j<n;j++){
			ar[j]=in.nextInt();
			c[ar[j]]++;
			
		}
		
		printArray(c);
		
	}
	}

}