package chapter2;
import java.util.Scanner;
/****************************************************************
 * Author： icynlau
 * Description: 打印表格
 * Others:  
 * Date:2021/3/31
 * ***************************************************************
 */
public class exc2_18 {
	
	public static void main(String[] args) {
		
		System.out.format("\ta\tb\tpow(a,b)\n");
		
		for(int i=1;i<=5;i++) {
			
			System.out.format("\t%d\t%d\t%d\n",i,i+1,(int)Math.pow(i, i+1));
			
		}
		
	}
	

}
