package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 找到将来的日期
 * Date:2021/4/1
 * ***************************************************************
 */
public class exc3_5 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter today's day:");
		int day=input.nextInt();
		System.out.print("Enter the number of days elpased since today:");
		int tmp=input.nextInt();
		
		int nextDay=(day+tmp)%7;
		String sDay=weekDay(day);
		String sNextDay=weekDay(nextDay);
		System.out.println("Today is "+sDay+" and the future day is "+sNextDay);
		
		
	}
	private static String weekDay(int day) {
		
		String sDay="";
		
		switch(day) {
		case 0:
			sDay="Sunday";
			break;
		case 1:
			sDay="Monday";
			break;
		case 2:
			sDay="Tuesday";
			break;
		case 3:
			sDay="Wednesday";
			break;
		case 4:
			sDay="Thursday";
			break;
		case 5:
			sDay="Friday";
			break;
		case 6:
			sDay="Saturday";
			break;
		}
		
		return sDay;
		
	}

}
