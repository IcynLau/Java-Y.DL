package chapter2;
import java.util.Scanner;
//exc2_5

public class exc2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate:");
		double fare= input.nextDouble();
		double rates=input.nextDouble();
		System.out.format("The gratuity is $%.1f  and total is $%.1f", fare*rates/100.0,fare*rates/100.0+fare);
	}
}
