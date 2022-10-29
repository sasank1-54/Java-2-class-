package JavaTask;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is a program to find the factorial of given number");
		
		int val;
		int res = 1;
		System.out.println("Enter the number to find out the factorial of that number");
		val = sc.nextInt();
		
		for(int i =1;i<=val;i++) {
			res*=i;
		}
		
		System.out.println("The Factorial Value of "+val+" is "+res);
	}

}
