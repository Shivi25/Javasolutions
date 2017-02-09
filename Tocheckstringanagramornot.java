package Hackerrankjavasolutions;

import java.util.Scanner;

public class Tocheckstringanagramornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        if(isAnagram1(A,B)){
        	System.out.println("Anagrams");
        }
        else{
        	System.out.println("Not Anagrams");
        	
        }
        

	}
	static boolean isAnagram(String a1,String b1){
		int arr[] = new int[26];
	        if (a1.length() != b1.length()) return false;
	        a1 = a1.toLowerCase();
	        b1 = b1.toLowerCase();
	        for(int i = 0; i < a1.length(); i++){
	            arr[a1.charAt(i) - 'a']++;//'a'=97
	            arr[b1.charAt(i) - 'a']--;
	        }
	        for(int i : arr){
	            if (i != 0) {
	                return false;
	            }
	        }
	        return true;
	     }
//	public static boolean isAnagram(String str1,String str2){
//		if(str1.length()!=str2.length())
//			return false;
//		boolean anagram=true;
//		for(int i=0;i<str1.length();i++){
//			if(str2.indexOf(str1.charAt(i))==-1)
//				anagram=false;
//		}
//		return anagram;
//	}

}
