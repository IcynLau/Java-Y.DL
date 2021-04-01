package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author:icynlau
 * Description: 计算复利 
 * 利滚利滚利
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_13 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the monthly saving amount:");
		
		double m=input.nextDouble();
		double saving=0.0;
		
		double rate=0.00417;
		
		for(int i=0;i<6;i++) {
			
			saving=(m+saving)*(1+rate);
			
		}
		
		System.out.format("After the sixth month,the account value is %.2f", saving);
		
	}
}
