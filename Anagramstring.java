package Hackerrankjavasolutions;
import java.util.*;

public class Anagramstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String rev="";
        for(int i=A.length()-1;i>=0;i--){
        	rev=rev+A.charAt(i);
        }
        if( A.equals(rev)){
    		System.out.println("Yes");}
        else
    		
    	        System.out.println("No");
    
    	}
    	
        
        }
//http://www.programmingsimplified.com/java/source-code/java-program-check-palindrome
        
//        public static boolean isPalindrome(String str){
//        	
//        	if (str==null)
//        		return false;
//        	String rev= reverse(str);
//        	if( str.equals(rev)){
//        		System.out.println("Yes");}
//        		
//        	        System.out.println("No");
//        	return true;
//        	}
//        	
//        
//        public static String reverse(String str){
//        	if(str==null)
//        		return null;
//        	if(str.length()<=1)
//        		return str;
//        	return reverse(str.substring(1)+str.charAt(0));
//        }
        
        
//        StringBuilder sb=new StringBuilder(A);
//       String B= sb.reverse().toString();
//        if(A.equals(B))
//        	System.out.println("Yes");
//        else
//        System.out.println("No");
//        	
//        	
//        }
	     
//        for(int i=0;i<str.length();i++){
//        	for(int j=str.length();j>=0;j--){
//        		if(str.charAt(i)==str.charAt(j)){
//        			System.out.println("Yes");
//        		}
//        		else
//        			System.out.println("No");
//        	}
//        }
        

	


