package Hackerrankjavasolutions;

import java.util.Scanner;

public class Javaendoffile {
	public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int i = 0;
        while(key.hasNext()){
            System.out.println(++i+" "+key.nextLine());
        }
    }
}