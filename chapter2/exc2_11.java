package chapter2;

import java.util.Scanner;

/****************************************************************
 * Author：icynlau
 * Description:人口统计
 * 
 * ***************************************************************
 */
public class exc2_11 {
	
	public static void main(String[] args) {
		
		double n=312032486;
		
		System.out.print("Enter the number of years:");
		
		Scanner input=new Scanner(System.in);
		
//		int nYears=input.nextInt();
		
		double nYears=input.nextDouble();
		
		double seconds_oneyear=365*24*60*60;
		
			
		n+=seconds_oneyear*nYears/7.0;
		n-=seconds_oneyear*nYears/13.0;
		n+=seconds_oneyear*nYears/45.0;
			
		
		System.out.format("The populatin in %d years is %d.",(int)nYears,Math.round(n));
		
	}

}
