package chapter2;
import java.util.Scanner;
//exc2_7 求出年数
public class exc2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes.");
		long minutes=input.nextLong();
		System.out.format("%d minutes is approximately %d years and %d days",minutes,minutes/60/24/365
				,minutes/60/24%365 );
	}
}
