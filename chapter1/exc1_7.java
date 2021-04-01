package chapter1;
//1.7  近似求p
public class exc1_7 {
	public static void main(String[] args) {
		double value1=1.0,value2=1.0;
		int sign=1;
		for(int i=1;i<=5;i++) {
			if(sign==1) {
				value1-=1.0/(2*i+1);
				sign=0;
			}else {
				value1+=1.0/(2*i+1);
				sign=1;
			}
		}
		
		sign=1;
		for(int j=1;j<=6;j++) {
			if(sign==1) {
				value2-=1.0/(2*j+1);
				sign=0;
			}else {
				value2+=1.0/(2*j+1);
				sign=1;
			}
		}
		
		System.out.format("\t%.2f,\t%.2f",4*value1,4*value2);
	}
}
