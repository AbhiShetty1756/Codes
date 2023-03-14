package practice;

import java.util.Scanner;

public class FloydTriangle {
	
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter the number of rows");
		int numOfRows = sc.nextInt();
		int counter=1;
		for(int i=0;i<numOfRows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(counter++ +" ");
			}
			System.out.println();
		}
	}
}
}
