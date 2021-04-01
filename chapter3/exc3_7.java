package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 整钱兑换零钱
 * Date:2021/4/1 
 * Test:
Enter an amount in int ,for example 1156:101
1 dollar and 1 pennie
Enter an amount in int ,for example 1156:203
2 dollars and 3 pennies
 * ***************************************************************
 */
public class exc3_7 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an amount in int ,for example 1156:");
		int remainingAmount=input.nextInt();
		
		String out="";
		
		int numberofDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		if(numberofDollars!=0&&numberofDollars==1) {
			out=out+numberofDollars+" dollar";
		}else if(numberofDollars!=0&&numberofDollars>1) {
			out=out+numberofDollars+" dollars";
		}else {
			
		}
		
		int numberofQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		if(numberofQuarters!=0&&numberofQuarters==1) {
			out=out+" and "+numberofQuarters+" quarter";
		}else if(numberofQuarters!=0&&numberofQuarters>1) {
			out=out+" and "+numberofQuarters+" quarters";
		}else {
			
		}
		
		int numberofDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		if(numberofDimes!=0&&numberofDimes==1) {
			out=out+" and "+numberofDimes+" dime";
		}else if(numberofDimes!=0&&numberofDimes>1) {
			out=out+" and "+numberofDimes+" dimes";
		}else {
			
		}
		
		int numberofNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		if(numberofNickels!=0&&numberofNickels==1) {
			out=out+" and "+numberofNickels+" nickel";
		}else if(numberofNickels!=0&&numberofNickels>1) {
			out=out+" and "+numberofNickels+" nickels";
		}else {
			
		}
		int numberofPennies=remainingAmount;
		if(numberofPennies!=0&&numberofPennies==1) {
			out=out+" and "+numberofPennies+" pennie";
		}else if(numberofPennies!=0&&numberofPennies>1) {
			out=out+" and "+numberofPennies+" pennies";
		}else {
			
		}
		
		System.out.println(out);
		
		
	}

}
