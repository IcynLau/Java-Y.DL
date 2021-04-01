package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: BMI
 * Date:2021/4/1
 * ***************************************************************
 */
public class exc3_6 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the pounds :");
		double pounds=input.nextDouble();
		System.out.println("Enter the feet :");
		double feet=input.nextDouble();
		System.out.println("Enter the inches :");
		double inches=input.nextDouble();
		
		//��λת��
		final double KILOGRAMS_PER_POUND=0.45359237;
		final double METERS_PER_INCH=0.0254;
		final double INCHES_PER_FEET=12;
		
		double kilogram=pounds*KILOGRAMS_PER_POUND;
		double meter=feet*INCHES_PER_FEET*METERS_PER_INCH+inches*METERS_PER_INCH;
		
		double bmi=kilogram/Math.pow(meter, 2);
		System.out.print("bmi is "+bmi+"\n");
		if(bmi<25) {
			System.out.println("Normal");
		}else if(bmi<30) {
			System.out.println("Overweight");
		}else {
			System.out.println("Obese");
		}
		
	}

}
