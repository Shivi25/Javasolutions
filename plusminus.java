package Hackerrankalgorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class plusminus {
    public static void main(String[] args) {
        
        double positive=0;
        double negative=0;
        double zeroes=0;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.println(n);
        int arr[] = new int[n];
        // total=positive+negative+zeros;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            

        if(arr[arr_i]>0){ 
           
             positive++;
            //System.out.println(positive/n);
        }
        else if (arr[arr_i]<0){
            
            
             negative++;
        //System.out.println(negative/n);
        }
        else if (arr[arr_i]==0) {
        
            zeroes++;
            
           
        //System.out.println(zeroes/n);
        }}
        DecimalFormat dfor=new DecimalFormat("0.000000");
            
         System.out.println(dfor.format(positive/n));
        System.out.println(dfor.format(negative/n));
         System.out.println(dfor.format(zeroes/n));
        
    }
}

