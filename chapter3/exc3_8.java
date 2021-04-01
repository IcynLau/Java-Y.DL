package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 对3个整数排序
 * Date:2021/4/1 
Enter three number in int:
12 36 5
Three number :5  12  36
Enter three number in int:
1 2 3
Three number :1  2  3
Enter three number in int:
65 32 1
Three number :1  32  65

 * ***************************************************************
 */
public class exc3_8 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three number in int:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		

		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		if(b>c) {
			int temp=b;
			b=c;
			c=temp;
		}
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		
		System.out.println("Three number :"+a+"  "+b+"  "+c);
		
	}
}
