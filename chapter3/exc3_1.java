package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 三个数的加法
*Date:2021/4/1
 * ***************************************************************
 */
public class exc3_1 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a,b,c:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double delta=b*b-4*a*c;
		
		if(delta>0) {
			
			double r1=(-b+Math.sqrt(delta))/(2.0*a);
			double r2=(-b-Math.sqrt(delta))/(2.0*a);
			System.out.print("x1="+r1+"\tx2="+r2+"\n");
			
		}else if(Math.abs(delta-0)<0.01) {
			
			double r=-b/(2.0*a);
			System.out.print("x="+r+"\n");
			
		}else {
			
			System.out.println("The equation has no real roots");
			
		}
		
	}

}
