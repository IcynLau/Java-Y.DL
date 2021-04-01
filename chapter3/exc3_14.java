package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author:icynlau
 * Description: 猜硬币正反面
 * Date:2021/4/1
 * Test:
Enter 0 or 1:0
correct
Enter 0 or 1:0
Sorry, you are wrong
Enter 0 or 1:3
Please enter 0 or 1
 * ***************************************************************
 */
public class exc3_14 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int coin=(int)(Math.random()*2);
		
		System.out.print("Enter 0 or 1:");
		int ans=input.nextInt();
		
		if(!(ans==1||ans==0)) {
			System.out.println("Please enter 0 or 1");
			System.exit(1);
		}
		
		if(ans==coin) {
			System.out.print("correct");
		}else {
			System.out.print("Sorry, you are wrong");
		}
		
	}

}
