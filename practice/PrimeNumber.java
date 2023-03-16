package practice;

import java.util.Scanner;

public class PrimeNumber {
	public static String rangeOfPossibilities(Long subject) {
		long i=1;
		long pointer=0;
		while(true) {
			if(pointer>subject) {
				return i+"";
			}
			else {
				System.out.println(i);
				pointer = i*i;
				i++;
				if(subject%i==0) {
					return "ans="+i;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long subject = sc.nextLong();
		
		String answer=rangeOfPossibilities(subject);
		if(answer.contains("ans=")) {
			System.out.println(answer.substring(4));
		}
		else {
			System.out.println("it is a prime number");
		}
	}

}
