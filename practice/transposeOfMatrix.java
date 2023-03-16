package practice;

import java.util.Scanner;

public class transposeOfMatrix {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m, n;
			System.out.println("Enter the number of rows and columns :");
			m = sc.nextInt();
			n = sc.nextInt();
			int[][] matrix = new int[m][n];
			System.out.println("ENter the elements");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			System.out.println("before transpose");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			for (int i = 0; i < m; i++) {
				for (int j = i	; j < n; j++) {
					int temp=matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=temp;
				}
			}
			System.out.println("after transpose");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
