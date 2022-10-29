package JavaTask;

import java.util.Scanner;

public class JaggedArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		int count = 0;
		int arr1[] = new int [row];
		int [][] arr = new int [row][];
		for(int i =0;i<row;i++) {
			System.out.println("Enter the no of columns for the "+i+"th row");
			arr1[i] = sc.nextInt();
			arr[i] = new int[arr1[i]];
			count += arr1[i];
		}
		
		
		
		System.out.println("Enter the "+count+" Values for the Arrays");
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Jagged Array Value is:");
		System.out.println();
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
