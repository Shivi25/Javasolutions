package Hackerrankjavasolutions;
import java.util.Scanner;

public class Countingsort2 {
	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		
	}

	public static int[] countingsort2(int[] A) {

		int i, j;
		int n = A.length;
		int B[] = new int[n];
		int r = 256;
		int C[] = new int[r];
		for (i = 0; i < n; i++) {
			C[i] = 0;
		}

		for (j = 0; j < n; j++) {

			C[A[j]]++;
		}

		for (i = 1; i < n; i++) {

			C[i] = C[i] + C[i - 1];

		}
		for (i = 0; i < n; i++) {
			B[C[A[i]] - 1] = A[i];
			// no decrease the count
			--C[A[i]];

		}
		

		for (i = 0; i < n; i++) {
			A[i] = B[i];
		}

		return A; 

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();

		}
		countingsort2(A);
		printArray(A);

	}
}
