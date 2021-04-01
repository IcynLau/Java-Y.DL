package chapter1;
//1.4   打印表格
public class exc1_4 {
	public static void main(String[] args) {
		System.out.println("\t\t a\t\ta^2\t\ta^3");
		int i=1;
		for(;i<=4;i++) {
			System.out.format("\t\t%d\t\t%d\t\t%d", i,i*i,i*i*i);
			System.out.println();
		}
		
	}
}
