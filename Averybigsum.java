package Hackerrankjavasolutions;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Averybigsum {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        long sum=0;
	        int n = in.nextInt();
	        System.out.println("given numer is" + in);
	        int arr[] = new int[n];
	        System.out.println("number of number is" +n);
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	            System.out.println(arr[arr_i]);
	        }
	        for(long num:arr)
	            
	        sum =sum+num;
	        System.out.println("sum of numbers is" +sum);
	            
	        }
	    }


