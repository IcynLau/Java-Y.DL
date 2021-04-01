package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description:计算风寒温度
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */

public class exc2_17 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit between -58°F and 41°F");
		double  ta=input.nextDouble();
		System.out.println("Enter the wind speed");
		double speed=input.nextDouble();
		
		System.out.format("The wind chill index is %.5f", 35.74+0.6215*ta-35.75*Math.pow(speed, 0.16)+0.4275*ta*Math.pow(speed, 0.16));
		
	}
	

}
