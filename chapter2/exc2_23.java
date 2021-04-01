package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author:icynlau
 * Description: 驾驶费用
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_23 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the distance, miles/gallon,  price/gallon:");
		double d=input.nextDouble();
		double m=input.nextDouble();
		double p=input.nextDouble();
		
		System.out.println("The cost of driving is "+d/m*p);
		
	}

}
