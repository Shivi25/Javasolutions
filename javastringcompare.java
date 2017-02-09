package Hackerrankjavasolutions;
import java.util.*;

public class javastringcompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		for(int i=0;i<s.length();i++){
			if(s.length()==k){
				System.out.print(s + " ");
				
			}
			System.out.println();
		}

}
}