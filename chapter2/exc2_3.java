package chapter2;
import java.util.Scanner;
//exc2_3
public class exc2_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a value for feet:");
		double inch=input.nextDouble();
		System.out.format("it's %.4f  meters", inch*0.305);
	}
}
