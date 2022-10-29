package JavaTask;

import java.util.Scanner;

public class MatriceAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row1 , col1, row2, col2;
		
		System.out.println("Enter the number of rows and columns for the first matrix: ");
		row1 = sc.nextInt();
		col1 =sc.nextInt();
		
		System.out.println("Enter the number of rows and columns for the second matrix: ");
		row2 = sc.nextInt();
		col2 = sc.nextInt();
		
		if(row1!=row2 && col1 != col2) {
			System.out.println("The Dimensions of the given matrices do not match i.e., "+"arr1["+row1+"]"+"["+col1+"]"+" arr2["+row2+"]"+"["+col2+"]");
			System.exit(1);
		}
		int [][]arr1 = new int [row1][col1];
		int [][]arr2 = new int [row2][col2];
		
		System.out.println("Enter the Value of the first Matrix: ");
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the Value of the Second Matrix: ");
		for(int i =0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The Addition result of the two Matices are: ");
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print(arr1[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
