package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author:icynlau
 * Description: 计算未来投资值ֵ
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_21 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter  investment amount, annual interest rate in percentage ,years");
		
		double amount=input.nextDouble();
		double interest=input.nextDouble();
		double year=input.nextDouble();
		System.out.format("Accmulated value is %.2f", amount*Math.pow((1+0.01*interest/12), 12*year));
		
	}

}
