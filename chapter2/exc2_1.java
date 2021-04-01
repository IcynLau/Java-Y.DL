package chapter2;
import java.util.Scanner;
//exc2_1
//将摄氏温度转换成华氏温度
public class exc2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double c= input.nextDouble();
		System.out.format("%.2f",(9.0/5.0)*c+32);
	}
}
