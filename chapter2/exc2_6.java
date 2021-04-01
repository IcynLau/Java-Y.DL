package chapter2;
import java.util.Scanner;
//exc2_6 求一个整数各位数之和
public class exc2_6 {
	 public static void main(String[] args) {
		 
		  Scanner input= new Scanner(System.in);
		  System.out.println("Enter a number:");
		  int number=input.nextInt();
		  
		  int digit1=number%10;
		  
		  int digit2 = number/10 %10;
		  
		  int digit3 =number/100 %10;
		  
		  int digit4 =number /1000 %10;
		  
		  int sum=digit1+digit2+digit3+digit4;
		  
		  System.out.print(sum);
		  
	 }
}
