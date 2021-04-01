package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 运输成本
 * Others: 
 * Date:2021/4/1 
 * ***************************************************************
 */
public class exc3_18 {
	public static void main(String[] args) {
		
		System.out.println("Enter the weight of package in kg:");
		Scanner input=new Scanner(System.in);
		double weight=input.nextDouble();
		double cost=0;
		
		if(weight>0&&weight<=1) {
			System.out.print("the cost is "+3.5);
		}else if(weight>1&&weight<=3) {
			System.out.print("the cost is "+5.5);
		}else if(weight>3&&weight<=10) {
			System.out.print("the cost is "+8.5);
		}else if(weight>10&&weight<=20) {
			System.out.print("the cost is "+10.5);
		}else if(weight>20) {
			System.out.print("the package cannot be shipped");
		}else {
			System.out.print("Error:Please input a number>0.");
		}
		
	}
}
