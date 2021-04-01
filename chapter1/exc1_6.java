package chapter1;

import java.io.*;
import java.util.Scanner;

//exc1.6试试异常处理ֵ
public class exc1_6 {
	public static void main(String[] args) throws IOException {
		System.out.println("Please input 'n' :");
		try (Scanner sc=new Scanner(System.in)){
			int n=sc.nextInt();
			int sum=0;
			for (int i=0;i<=n;i++) {
				sum +=i;
			}
			System.out.format("\t 1+2+3+...+n=%d ",sum);	
		}

		
	}
}
