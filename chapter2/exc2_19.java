package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 计算三角形的面积
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_19 {
	
	private static double side(double x1,double x2,double y1,double y2) {
		
		return (Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double s1=side(x1,x2,y1,y2);
		double s2=side(x1,x3,y1,y3);
		double s3=side(x2,x3,y2,y3);
		
		double s=0.5*(s1+s2+s3);
		
		System.out.format("The area of the triangle is %.1f", Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)));
		
	}

}
