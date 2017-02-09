package Hackerrankjavasolutions;
import java.util.Scanner;
public class Thefullcountingsort {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			// System.out.println("");
			// System.out.println(n);
			int i = 0;
			int[] A = new int[n];
			while (in.hasNext()) {
				if (in.hasNextInt()) {

					A[i] = in.nextInt();

					 System.out.println(A[i]);
					i++;
					if (i == n) {
						break;
					}

				}


			}
			printArray(A);
			//countingsort2(A);

		}

//		public static int[] countingsort2(int[] A) {
//
//			int i, j;
//			int n = A.length;
//			//int B[] = new int[n];
//			int r =100000;
//			int C[] = new int[r];
//			for (i = 0; i < n; i++) {
//				C[i] = 0;
//			}
//
//			for (j = 0; j < n; j++) {
//
//				C[A[j]]++;
//			}
//	//
//			int count = 0;
////			for (i = 0; i < C.length; i++) {
////				count += C[i];
////				System.out.print(count + " ");
////			}
//			for( i=0; i<100; i++){
//				for( j=0; j<=i ;j++){
//					count= count + C[j];
//				}
//				System.out.print(count + " ");
//				count = 0;
//			}
//
//			return C;
//
//		}

		static void printArray(int[] ar) {
			for (int n : ar) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		
	}



