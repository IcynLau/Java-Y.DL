package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 随机点
 * Others: 随机点范围 -50<=x<=50  -100<=y<=100
 * Date:2021/4/1 
 * ***************************************************************
 */
public class exc3_16 {
	
	public static void main(String[] args) {
		
		double x=0,y=0;
		x=Math.random()*50;
		y=Math.random()*100;
		System.out.format("The point is (%.2f,%.2f).",x,y);
		
		
	}

}
