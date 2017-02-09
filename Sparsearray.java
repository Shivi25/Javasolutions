package Hackerrankalgorithm;

import java.util.Scanner;
import java.util.*;

public class Sparsearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> a=new ArrayList<String>(n);
		for(int i=0;i<n;i++){
			a.add(sc.next());
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int count=0;
			String s=sc.next();
			for(String str:a){
				if(str.equals(s))
					count++;
				
			}
			System.out.println(count);
		}

	}

}
