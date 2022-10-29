package JavaTask;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is a Program to show the table for a particular table \n");
		
		System.out.println("Enter the number to which you want to display the table: ");
		int val = sc.nextInt();
		System.out.println(val+" Table is Printed below");
		for(int i = 1; i<= 20;i++) {
			System.out.println(val+" x "+i+" = "+ val*i);
		}
	}
}
