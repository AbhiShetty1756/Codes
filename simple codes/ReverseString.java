package practice;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)) {
		String subject = sc.next();
		String reverse="";
		for(int i=subject.length()-1;i>=0;i--) {
			reverse+=subject.charAt(i)+"";
		}
		System.out.println(reverse);
}
}
}