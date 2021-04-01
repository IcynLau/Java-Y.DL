package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author：icyn
 * Description: 计算BMI
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_14 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter weight in pounds:");
		double weight=0.45359237*input.nextDouble();
		System.out.println("Enter height in inches");
		double height=0.0254*input.nextDouble();
		
		System.out.format("BMI is %.4f",weight/(height*height));
		
	}
}
