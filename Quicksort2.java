package Hackerrankjavasolutions;

import java.util.*;

public class Quicksort2 {
	static int partition(int ar[], int p, int r) {

		int x = ar[r];

		int i = p;
		for (int j = p; j < r; j++)
			if (ar[j] <= x) {

				swap(ar, i, j);
				
				i++;
			}

		swap(ar, i, r);

		return i;
	}

	public static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public static void Quicksort(int ar[], int p, int r) {
		if (p < r) {

			int q = partition(ar, p, r);

			
			 printArray( ar);
			Quicksort(ar, p, q - 1);
			Quicksort(ar, q + 1, r);
		}
	}

	static void printArray(int ar[]) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}

		Quicksort(ar, 0, n - 1);

	}
}