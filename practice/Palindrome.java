package practice;

import java.util.Scanner;

public class Palindrome {
	public static void palindromeUsingRegularMethod(String subject) {
		String rev = "";
		for(int i=subject.length()-1;i>=0;i--) {
			rev+=subject.charAt(i);
			
		}
		if(rev.equals(subject)) {
			System.out.println(rev);
			System.out.println("it is an palindrome");
			
		}
		else {
			System.out.println(rev);
			System.out.println("not an palindrome");
		}
	}
	public static void palindromeUsingDivideMethod(String subject) {
		int start = 0;
		int end = subject.length()-1;
		while(start<=end) {
			if(subject.charAt(start)==subject.charAt(end)) {
				start++;
				end--;
				System.out.println("start :"+start+" end : " +end );
			}
			else {
				System.out.println("not a palindrome");
				break;
			}
		}
		if(start>=end) {
			System.out.println("it is a palindrome");
		}
	}
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		String subject=sc.next();
//		palindromeUsingRegularMethod(subject);
		palindromeUsingDivideMethod(subject);
		
	}
}
}
