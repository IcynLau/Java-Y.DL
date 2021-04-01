package chapter3;
import java.util.Scanner;
/****************************************************************
 * Author：icynlau
 * Description: 彩票
 * Date:2021/4/1 
 * Test:
Enter your lottery pick (three digits):
516
The lottery number is 039
Sorry, Bad luck.

Enter your lottery pick (three digits):
111
The lottery number is 713
Match a digit: you win 1000 dollars.

Enter your lottery pick (three digits):
5461
Please enter 3-digits number!

Enter your lottery pick (three digits):
112
The lottery number is 112
Exact match: you win 10000 dollars.
 * ***************************************************************
 */
public class exc3_15 {
	
	public static void main(String[] args) {
		
		int lottery=(int)(Math.random()*1000); //����0-999�������
		int storeLottery=lottery;
		int lotteryDigit1=lottery%10;
		lottery/=10;
		int lotteryDigit2=lottery%10;
		lottery/=10;
		int lotteryDigit3=lottery%10;
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your lottery pick (three digits):");
		int guess=input.nextInt();
		int storeGuess=guess;
		int guessDigit1=guess%10;
		guess/=10;
		int guessDigit2=guess%10;
		guess/=10;
		int guessDigit3=guess%10;
		if(guess/10!=0) {
			System.out.println("Please enter 3-digits number!");
			System.exit(1);
		}
		
		System.out.format("The lottery number is %03d\n",storeLottery);
//		System.out.println("The lottery number is "+storeLottery);
//		System.out.println("The guess number is "+storeGuess);
		
		if(guess==lottery) {
			
			System.out.println("Exact match: you win 10000 dollars.");
			
		}else if(guessDigit1==lotteryDigit1
				||guessDigit1==lotteryDigit2
				||guessDigit1==lotteryDigit3
				||guessDigit2==lotteryDigit1
				||guessDigit2==lotteryDigit2
				||guessDigit2==lotteryDigit3
				||guessDigit3==lotteryDigit1
				||guessDigit3==lotteryDigit2
				||guessDigit3==lotteryDigit3) {
			
			System.out.println("Match a digit: you win 1000 dollars.");
			
		}else if(guessDigit1==lotteryDigit1&&guessDigit2==lotteryDigit3&&guessDigit3==lotteryDigit2
			||guessDigit1==lotteryDigit2&&guessDigit2==lotteryDigit1&&guessDigit3==lotteryDigit3
			||guessDigit1==lotteryDigit2&&guessDigit2==lotteryDigit3&&guessDigit3==lotteryDigit1
			||guessDigit1==lotteryDigit1&&guessDigit2==lotteryDigit1&&guessDigit3==lotteryDigit1
			||guessDigit1==lotteryDigit3&&guessDigit2==lotteryDigit1&&guessDigit3==lotteryDigit2
			||guessDigit1==lotteryDigit3&&guessDigit2==lotteryDigit2&&guessDigit3==lotteryDigit1) {
			
			System.out.println("Match all digits: you win 3000 dollars.");
			
		}else {
			
			System.out.println("Sorry, Bad luck.");
			
		}
		
		
	}

}
