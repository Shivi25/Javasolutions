package Hackerrankjavasolutions;
import java.util.*;
public class JavaStringsIntroduction {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length;
		System.out.println(length=A.length()+B.length());
		if(A.equals(B)){
			System.out.println("Yes");
			
		}
		
		System.out.println("No");
		A=A.substring(0, 1).toUpperCase()+A.substring(1).toLowerCase();
		B=B.substring(0, 1).toUpperCase()+B.substring(1).toLowerCase();
		
		System.out.println(A + " " + B);

        
        
           
        
    }

	
}


