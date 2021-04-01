package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 回文数字
 * Date:2021/4/1 
 * Test:
Enter a three-digit integer:
121
121 is a palindrome
Enter a three-digit integer:
123
123 is not a palindrome
 * ***************************************************************
 */
public class exc3_12 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a three-digit integer:");
		String sNumber=input.next();
		char[]   cArray=sNumber.toCharArray();
		
		int i=0,j=sNumber.length()-1;
		
		while(i<j&&cArray[i]==cArray[j]) {
			i++;
			j--;	
		}
		
		if(i<j) {
			System.out.println(sNumber+" is not a palindrome");
		}else {
			System.out.println(sNumber+" is a palindrome");
		}
		
	}
	
}
