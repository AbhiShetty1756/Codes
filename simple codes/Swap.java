package practice;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.printf("Before Swap a=%d, b=%d\n",i,j);
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.printf("After swap i= %d  j=%d\n",i,j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.printf("After swap i= %d  j=%d\n",i,j);
		

	}

}
