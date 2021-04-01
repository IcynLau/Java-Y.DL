package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author:icynlau
 * Description: 计算利息
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_20 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate:");
		
		double balance=input.nextDouble();
		double interest=input.nextDouble();
		
		System.out.format("The interest is %.5f",balance*(interest/1200));
		
	}

}
