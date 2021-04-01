package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 加法测验
 * Date:2021/4/1 上午
 * Test:
What is 18 + 38 ?
56
You are correct.
What is 14 + 24 ?
1
Sorry , the right answer is 38
 * ***************************************************************
 */
public class exc3_10 {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int number1=(int)(Math.random()*100);
		int number2=(int)(Math.random()*100);
		
		System.out.println("What is "+number1+" + "+number2+" ?");
		int ans=input.nextInt();
		
		if(ans==(number1+number2)) {
			
			System.out.println("You are correct.");
			
		}else {
			
			System.out.println("Sorry , the right answer is "+(number1+number2));
		}
		
	}

}
