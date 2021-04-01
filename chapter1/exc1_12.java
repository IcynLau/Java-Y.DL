package chapter1;
//1.12 以公里记平均速度
public class exc1_12 {
	public static void main(String[] args) {
		double km=24*1.6;
		double time=1+40.0/60.0+35.0/60.0/60.0;
		System.out.format("\t%.2f km/h", km/time);
	}
}
