package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 检查ISBN-10
 * Date:2021/4/1 
 * Test:
Enter a 9-digit integer :
013601267
The ISBN-10 number is  0136012671
Enter a 9-digit integer :
013031997
The ISBN-10 number is  013031997x
 * ***************************************************************
 */
public class exc3_9 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 9-digit integer :");
		String sNumber=input.next();
		int number=Integer.parseInt(sNumber);
		
		int d9=number%10;
		number/=10;
		int d8=number%10;
		number/=10;
		int d7=number%10;
		number/=10;
		int d6=number%10;
		number/=10;
		int d5=number%10;
		number/=10;
		int d4=number%10;
		number/=10;
		int d3=number%10;
		number/=10;
		int d2=number%10;
		number/=10;
		int d1=number;
		
		int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		
		if(d10==10) {
			System.out.println("The ISBN-10 number is  "+sNumber+"x");
		}else {
			System.out.println("The ISBN-10 number is  "+sNumber+d10);
		}
		
	}

}
