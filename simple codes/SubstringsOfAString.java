package practice;

import java.util.Scanner;

class SubstringsOfAString {
	public static void main(String args[]) {
		String subject;
		try(Scanner sc = new Scanner(System.in)){
			subject = sc.next();
			int length = subject.length();
			for(int i=0;i<length;i++) {
				for(int j = 1;j<=length-i;j++) {
					System.out.println(subject.substring(i,i+j));
				}
			}
		}
	}
}