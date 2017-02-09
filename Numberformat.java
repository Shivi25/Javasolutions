package Hackerrankjavasolutions;
import java.util.Scanner;
//import java.text.format;
import java.util.*;

public class Numberformat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d=sc.nextDouble();
		String us=java.text.NumberFormat.getCurrencyInstance(Locale.US).format(d);
		String china=java.text.NumberFormat.getCurrencyInstance(Locale.CHINA).format(d);
		String france=java.text.NumberFormat.getCurrencyInstance(Locale.FRANCE).format(d);
		Locale locale=new Locale("en","in");
		String india=java.text.NumberFormat.getCurrencyInstance(locale).format(d);
		
		
		System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }


		
		
		

}
