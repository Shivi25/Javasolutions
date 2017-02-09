package Hackerrankjavasolutions;
import java.util.*;



	import java.util.*;
	import java.io.*;

	

		import java.util.*;
		import java.io.*;

		public class javaloops2 {
			
		    public static void main(String []argh){
		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		        for(int i=0;i<t;i++){
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int n = in.nextInt();
		            
		                    for(int j=0;j<n;j++)
		                     
		           {
		                        int sum=0;
		                        for(int p=j;p>=0;p--)
		                        {
		                            sum=sum+(int)(Math.pow(2,p));
		                        }
		               System.out.print((int)(a+(sum)*b)+" ");
		            }System.out.println("");
		        }

		        in.close();
		    }
		}