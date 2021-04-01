package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 三个数的加法
 * Date:2021/4/1
 * ***************************************************************
 */
public class exc3_2 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int number1=(int)(System.currentTimeMillis()%10);
		int number2=(int)(System.currentTimeMillis()/3%10);
		int number3=(int)(System.currentTimeMillis()/7%10);
		
		System.out.println("What is "+number1+"+"+number2+"+"+number3+"  ?");
		
		int ans=input.nextInt();
		
		if((number1+number2+number3)==ans) {
			System.out.println("Correct!");
		}else {
			System.out.println("Sorry,  the answer is "+(number1+number2+number3));
		}
		
	}

}
