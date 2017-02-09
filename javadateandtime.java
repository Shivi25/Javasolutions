package Hackerrankjavasolutions;
import java.time.LocalDate;
import java.util.Scanner;
public class javadateandtime {

	public javadateandtime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month=sc.nextInt();
		int dayOfMonth=sc.nextInt();
		int year=sc.nextInt();
		sc.close();
		LocalDate lt=LocalDate.of(year, month, dayOfMonth);
		System.out.print(lt.getDayOfWeek());
		

	}

}
