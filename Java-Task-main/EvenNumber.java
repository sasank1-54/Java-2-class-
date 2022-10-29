package JavaTask;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lower, upper;
		System.out.println("/This is a Program to Print Even Number for the given range");
		
		System.out.println("Enter The lower Range:");
		lower = sc.nextInt();
		System.out.println("Enter The Upper Range: ");
		upper = sc.nextInt();
		
		System.out.println("The Even Number Within the given range of ("+lower+","+upper+") are:");
		
		for(int i = lower; i<=upper;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
