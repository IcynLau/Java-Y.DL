package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author： icynlau
 * Description: 计算六边形面积
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */

public class exc2_16 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the side");
		
		double  side=input.nextDouble();
		
		System.out.format("The area of the hexagon is %.4f", 3*Math.sqrt(3)/2*side*side);
		
	}

}
