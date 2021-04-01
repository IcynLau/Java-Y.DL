package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 剪刀石头布
 * Date:2021/4/1 
 * Test:
scissor-0 rock-1 paper-2:
1
The computer is paper . You are rock. You lose.

scissor-0 rock-1 paper-2:
0
The computer is scissor . You are scissor too. It is a draw.

scissor-0 rock-1 paper-2:
1
The computer is rock . You are rock too. It is a draw.

scissor-0 rock-1 paper-2:
1
The computer is scissor . You are rock. You won.
 * ***************************************************************
 */
public class exc3_17 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("scissor-0 rock-1 paper-2:");
		int computer=(int )(Math.random()*3);
		int person=input.nextInt();
		
		
		
		System.out.print("The computer is "+number2String(computer)+" . You are "+number2String(person));
		if(computer==person) {
			System.out.print(" too. It is a draw.\n");
		}else if(computer==0&&person==2
				||computer==1&&person==0
				||computer==2&&person==1){
			System.out.print(". You lose.\n");
		}else if(computer==2&&person==0
				||computer==0&&person==1
				||computer==1&&person==2){
			System.out.print(". You won.\n");
		}else {
			System.out.println("Error");
		}
	}
	private static String number2String(int number) {
		
		String s="";
		switch(number) {
		case 0:
			s="scissor";
			break;
		case 1:
			s="rock";
			break;
		case 2:
			s="paper";
			break;
		default:
			System.out.println("Error");
			System.exit(1);
		}
		return s;
		
	}
	
	

}
