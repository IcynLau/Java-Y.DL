package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 货币单位
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_22 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an amout in int ,for example 1156：\n");
		int remainingAmount=input.nextInt();
		
		int numberofDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		int numberofQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		
		int numberofDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		
		int numberofNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		
		int numberofPennies=remainingAmount;
		
		System.out.println("you have "+numberofDollars +" Dollars ;");
		System.out.println("you have "+numberofQuarters +" Quarters ;");
		System.out.println("you have "+numberofDimes +" Dimes ;");
		System.out.println("you have "+numberofNickels +" Nickels ;");
		System.out.println("you have "+numberofPennies +" Pennies ;");
		
		
		
		
	}

}
