package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 计算风寒温度
 * Date:2021/4/1 
 * Test:
Enter the temperature in fahrenheit between -58°F and 41°F：
5.3
Enter the wind speed：
6
The wind chill index is -5.56707

Enter the temperature in fahrenheit between -58°F and 41°F：
-88
Enter the wind speed：
6
输入不合法

 * ***************************************************************
 */
public class exc3_20 {
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit between -58°F and 41°F：");
		double  ta=input.nextDouble();
		System.out.println("Enter the wind speed：");
		double speed=input.nextDouble();
		
		if((ta>41||ta<-58)||(speed<2)) {
			System.out.print("输入不合法\n");
		}else {
			System.out.format("The wind chill index is %.5f", 35.74+0.6215*ta-35.75*Math.pow(speed, 0.16)+0.4275*ta*Math.pow(speed, 0.16));
		}
		
	}

}
