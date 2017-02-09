package Hackerrankjavasolutions;
import java.io.*;
import java.util.*;

public class Inrototutorialchallenge  {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=in.nextInt();
        int count=0;
        while(in.hasNextInt()){
        	if(in.nextInt()==n){
        		System.out.println(count);
        		//count=count+1;
        		break;
        		
        		
        	}
        	count=count+1;
        }
        }
        
       
           
   
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
            
           }
            System.out.println("");
    
        }
        
    }
