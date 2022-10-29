package JavaTask;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int flag = 1;
		if(num==2) {
			System.out.println("The Given Number is Even");
			System.exit(0);
		}
		if(num==0||num==1) {
			System.out.println("The Given Number Doesn't Fall Under Any Category");
			System.exit(0);
		}
		for(int i = 2;i<num;i++) {
			if(num%i==0) {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("The Given Number "+num+" is Even");
		}
		else {
			System.out.println("The Given Number "+num+" is not Even");
		}
	}

}
