package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 随机月份
 * Date:2021/4/1
 * ***************************************************************
 */
public class exc3_4 {
	public static void main(String[] args) {
		
//		Scanner input=new Scanner(System.in);
		int month=(int)(System.currentTimeMillis()%12);
		String sMonth="";
		switch(month+1) {
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
		
		System.out.println(sMonth);
		
	}

}
