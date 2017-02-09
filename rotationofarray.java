package Hackerrankalgorithm;

import java.util.Scanner;

public class rotationofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
			ar[(i+n-d)%n]=sc.nextInt();
		}
		//for(int i=0;i<n;i++){
			//ar[(i+d)%n]=sc.nextInt();
		//}
		for(int i=0;i<n;i++){
			System.out.print(ar[i]+ " ");
		}
		

	}

}
