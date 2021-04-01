package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 计算三角形的周长
 * Date:2021/4/1 
 * Test:

Enter three sides:3 4 5
周长为12.00

Enter three sides:3 4 100
输入不合法
 * ***************************************************************
 */
public class exc3_19 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three sides:");
		double s1=input.nextDouble();
		double s2=input.nextDouble();
		double s3=input.nextDouble();
		
		if(Math.abs(s3-s2)>s1
				||Math.abs(s3-s1)>s2
				||Math.abs(s1-s2)>s3) {
			
			System.out.println("输入不合法");
			
		}else {
			
			System.out.format("周长为%.2f",s1+s2+s3);
			
		}
		
	}

}
