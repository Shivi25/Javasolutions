package Hackerrankjavasolutions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javastaticblock {
	//int L,B,Area;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int B=sc.nextInt();
		int H=sc.nextInt();
		int Area;
		
		//try 
		//{
		if(B >=0 && H>=0){
			Area=B*H;
			System.out.println(Area);
		}
		
		else{
		//catch(Exception e){
			//System.out.println(e);
	   System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
		}
		

}
	

	
