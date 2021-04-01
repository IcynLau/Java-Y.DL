package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 求一个月总天数
 * Date:2021/4/1
 * Test:
Enter the month ,year :2 2012
February  2012   has 29 days
Enter the month ,year :3 2015
March  2015   has 31 days
 * ***************************************************************
 */
public class exc3_11 {
	
	public static void main(String[] args) {
		
		System.out.print("Enter the month ,year :");
		
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		int year=input.nextInt();
		
		String sMonth="";
		switch(month) {
		case 1:
			sMonth="january";
			break;
		case 2:
			sMonth="February";
			break;
		case 3:
			sMonth="March";
			break;
		case 4:
			sMonth="April";
			break;
		case 5:
			sMonth="May";
			break;
		case 6:
			sMonth="June";
			break;
		case 7:
			sMonth="July";
			break;
		case 8:
			sMonth="August";
			break;
		case 9:
			sMonth="September";
			break;
		case 10:
			sMonth="October";
			break;
		case 11:
			sMonth="November";
			break;
		case 12:
			sMonth="December";
			break;
		}
		
		int days=0;
		switch(month) {
		case 1:
			days=31;
			break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0)) {
				days=29;
			}else {
				days=28;
			}
			break;
		case 3:
			days=31;
			break;
		case 4:
			days=30;
			break;
		case 5:
			days=31;
			break;
		case 6:
			days=30;
			break;
		case 7:
			days=31;
			break;
		case 8:
			days=31;
			break;
		case 9:
			days=30;
			break;
		case 10:
			days=31;
			break;
		case 11:
			days=30;
			break;
		case 12:
			days=31;
			break;
			
		default:
			System.out.println("Error");
		
		}
		
		System.out.println(sMonth+"  "+year+"  "+" has "+days+" days");
		
	}

}
