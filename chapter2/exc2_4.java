package chapter2;
import java.util.Scanner;
//exc2_4
public class exc2_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter anumber in pounds:");
		double pounds=input.nextDouble();
		System.out.format("it's %.3f kg", pounds*0.454);
	}
}
