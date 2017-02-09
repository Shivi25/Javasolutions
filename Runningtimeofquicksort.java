package Hackerrankjavasolutions;
import java.io.*;
import java.util.*;

public class Runningtimeofquicksort {
	static int shift = 0;
	static int swap = 0;

	public static int numberOfShiftInsertionSort(int[] A,int n) {
		//int shift=0;
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > value) {
				A[j + 1] = A[j];
				
				j = j - 1;
				shift++;
				
			}
			//shift++;
			A[j + 1] = value;
				//shift++;
		}
		return shift;
		//shift++;
		//System.out.println(shift);

	}
	

	static int partition(int ar[], int p, int r) {
		//int swap=0;

		int x = ar[r];

		int i = p;

		for (int j = p; j < r; j++){
			if (ar[j] <= x) {

				swap(ar, i, j);
				swap++;
				i++;
                
			}
		   //swap++;
		}
			swap(ar, i, r);
			//swap++;
			
		
		

		return i;

	}
	public static void Quicksort(int ar[], int p, int r) {
		if (p < r) {

			int q = partition(ar, p, r);
			swap++;

			
			// printArray( ar);
			Quicksort(ar, p, q - 1);
			Quicksort(ar, q + 1, r);
			
		}
	}

	public static void swap(int[] ar, int i, int j) {
	//swap++;
		int temp = ar[i];
		
		ar[i] = ar[j];
		
		ar[j] = temp;
		
		
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		int[] ar2 = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
			ar2[i] = ar[i];
		}
		Quicksort(ar, 0, n - 1);
		System.out.println(swap);
		
		numberOfShiftInsertionSort(ar2,n);
		System.out.println(shift);
		
		System.out.println(shift-swap);
		
		//Quicksort(ar, 0, n - 1);

		//quicksorter( ar);
		//partition(ar, 0, n - 1);
	
		


		//System.out.println(shift - swap);

	}
}
