package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 求加速度
 * Others:
 * 
 * ***************************************************************
 */
public class exc2_9 {
	public static void main(String[] args) {
		
		System.out.print("Enter v0,v1, and t:");
		
		Scanner input=new Scanner(System.in);
		
		double v0=input.nextDouble();
		
		double v1=input.nextDouble();
		
		double t=input.nextDouble();
		
		
		
		double a=(v1-v0)/t;
		
		System.out.format("The average acceleration is %10.4f",a);
	}
}
