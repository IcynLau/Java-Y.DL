package chapter1;
//打开cmd  执行的时候尝试给他参数n
public class exc1_6_1 {
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.format("\t 1+2+3+...+n=%d ",sum);
		
	}
}
