package chapter2;
import java.util.Scanner;
//exc 2_2
//计算圆柱体面积
public class exc2_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input radius length:");
		double radius=input.nextDouble();
		double length=input.nextDouble();
		System.out.format("area:%.4f, v:%.4f",Math.PI*radius*radius,Math.PI*radius*radius*length);
	}
}
