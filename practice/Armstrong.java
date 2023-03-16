package practice;

import java.util.Scanner;

public class Armstrong {
	public static boolean armstrong(int subject) {
		int dummy = subject;
		int result=0;
		int noOfDigits=0;
		while(dummy>0) {
			dummy/=10;
			noOfDigits++;
		}
		dummy=subject;
		while(dummy>0) {
			int digit =(dummy%10);
			int addable=1;
			for(int i = 0;i<noOfDigits;i++) {
				addable*=digit;
			}
			result = result + addable;	
			dummy/=10;
		}
		if(result == subject) {
			return true;
		}
		else {
			return false;
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int subject = sc.nextInt();
	System.out.println(armstrong(subject));
}
}
