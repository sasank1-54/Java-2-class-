package JavaTask;

import java.util.Scanner;

abstract class Bank{
	private Scanner sc;
	private long accNum;
	public void accountNumber() {
		sc = new Scanner(System.in);
		
		System.out.println("Enter The Bank Account Number: ");
		accNum = sc.nextLong();
	}
	abstract void deposit();
	abstract void withDrawl();
	abstract void rateOfInterest();
}


class SavingsAccount extends Bank{
	
	Scanner sc = new Scanner(System.in);
	float amount;
	float witham;
	@Override
	void deposit() {
		super.accountNumber();
		System.out.println("Enter The Amount to be Deposited into the bank account: ");
		amount = sc.nextFloat();
		System.out.println("The Sum of Rs."+amount+"is Deposited into your bank account");
	}

	@Override
	void withDrawl() {
		System.out.println("Enter The Sum in Rs. which you want to withdraw from your account: ");
		witham = sc.nextFloat();
		if(witham > amount || (amount-witham)<5000) {
			System.out.println("Cannot Withdraw Amount Becuase of 2 conditions \n1.Withdrawl Amount is greater than Bank Balance.\n2. The Banks Balance will be less than Rs 5000.00 ");
			System.exit(0);
		}
		else {
			System.out.println("The Amount Rs. "+witham+" is withdrawn Successfully!");
		}
	}

	@Override
	void rateOfInterest() {
		System.out.println("The Per Annum rate of interest is 5.5% for savings account ");
	}
	
}


class CurrentAccount extends Bank{
	
	Scanner sc = new Scanner(System.in);
	
	float amount;
	float witham;
	
	@Override
	void deposit() {
		super.accountNumber();
		System.out.println("Enter The Amount to be Deposited into the bank account: ");
		amount = sc.nextFloat();
		System.out.println("The Sum of Rs."+amount+"is Deposited into your bank account");
	}

	@Override
	void withDrawl() {
		System.out.println("Enter The Sum in Rs. which you want to withdraw from your account: ");
		witham = sc.nextFloat();
		if(witham > amount || (amount-witham)<20000) {
			System.out.println("Cannot Withdraw Amount Becuase of 2 conditions \n1.Withdrawl Amount is greater than Bank Balance.\n2. The Banks Balance will be less than Rs 5000.00 ");
			System.exit(0);
		}
		else {
			System.out.println("The Amount Rs. "+witham+" is withdrawn Successfully!");
		}
	}
		

	@Override
	void rateOfInterest() {
		System.out.println("There is no rate of interest that can be given for the current account");
		
	}
	
}











public class AbstactImpl {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		
		System.out.println("\n1.Savings Account.\n2.Current Account.\nSelect Your Bank account Type(1/2): ");
		int choice = sc.nextInt();
		
	
		if(choice ==1) {
			do {
				System.out.println("1.Deposit. \n2.Withdrawl. \n3.Rate of Interest.\nEnter Your choice(to exit enter 0): ");
				int choice1 = sc.nextInt();
				switch(choice1) {
				case 1:
					sa.deposit();
				case 2:
					sa.withDrawl();
				case 3:
					sa.rateOfInterest();
				}
				
			}while(choice == 0);
		}
		else {
			do {
				System.out.println("1.Deposit. \n2.Withdrawl. \n3.Rate of Interest.\nEnter Your choice(to exit enter 0): ");
				int choice1 = sc.nextInt();
				switch(choice1) {
				case 1:
					ca.deposit();
				case 2:
					ca.withDrawl();
				case 3:
					ca.rateOfInterest();
				}
				
			}while(choice == 0);
		}
	}

}