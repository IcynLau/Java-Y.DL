package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 求跑道长度
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_12 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter speed and acceleration:");
		
		double v=input.nextDouble();
		double a=input.nextDouble();
		double length=0;
		
		System.out.format("The minimum runway length for this airplane is %.3f",v*v/(2.0*a));
		
		
	}
}
