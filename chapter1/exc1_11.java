package chapter1;
//1.11 人口估算
public class exc1_11 {
	public static void main(String[] args) {
		double seconds_oneyear=365*24*60*60;
		int num=312032486;
		for(int i=1;i<=5;i++) {
			num+=seconds_oneyear*(double)i/7.0;
			num-=seconds_oneyear*(double)i/13.0;
			num+=seconds_oneyear*(double)i/45.0;
			System.out.format("第%d年人口数%d\n",i,num);
			
		}
	}
}
