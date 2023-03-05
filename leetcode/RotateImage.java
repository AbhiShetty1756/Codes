package practice;

import java.util.Arrays;

public class RotateImage {
	
	public static void rotate(int[][] matrix) {
		int temp;
		for(int i =0;i<matrix.length;i++) {
			for(int j=i;j<matrix.length;j++) {
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i =0;i<matrix.length;i++) {
			int left=0,right=matrix.length-1;
			while(!(left<right)){
				temp=matrix[i][left];
				matrix[i][left]=matrix[i][right];
				matrix[i][right]=temp;
			}
		}
		
        
    }
	
	public static void main(String[] args) {
		
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		rotate(arr);
		
	}
}
