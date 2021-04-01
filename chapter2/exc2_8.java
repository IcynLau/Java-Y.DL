package chapter2;
import java.util.Scanner;
//exc2_8 当前时间
public class exc2_8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT:");
		int timeZone=input.nextInt();
		
		System.out.println("The current time is:"+(System.currentTimeMillis()/1000/60/60%24+timeZone)
				+" : "+System.currentTimeMillis()/1000/60%60+" : "+System.currentTimeMillis()/1000%60 );
		
	}
}
