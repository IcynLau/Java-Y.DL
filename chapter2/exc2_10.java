package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author:icynlau
 * Description: 计算圆柱体的体积
 * Others:
 * 
 * ***************************************************************
 */
public class exc2_10 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms:");
		
		double m=input.nextDouble();
		
		System.out.print("Enter the initial temperature:");
		
		double i=input.nextDouble();
		
		System.out.print("Enter the final temperature:");
		
		double f=input.nextDouble();
		
		double energy=m*(f-i)*4184;
		
		System.out.format("The energy needed is %10.1f",energy);
		
	}

}
