package JavaTask;

import java.util.Scanner;

public class SquaredArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		System.out.println("Enter the "+arr.length+" elements of array :");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The square of the array elements are:");
		for(int i =0;i<arr.length;i++) {
			
			System.out.print(arr[i]*arr[i]+" ");
		}
	}

}
