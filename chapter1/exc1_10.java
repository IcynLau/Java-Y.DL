package chapter1;
//1.10 以英里记的平均速度
public class exc1_10 {
	public static void main(String[] args) {
		double miles=14/1.6;                      
		
		double time=45.0/60.0+0.5/60.0; 
		
//		double time=45/60+0.5/60;

		
		System.out.format("\tV=%.2f",miles/time );
	}
}
