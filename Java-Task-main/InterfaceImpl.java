package JavaTask;

import java.util.Scanner;

interface Bank1{
	abstract void bankAccountNumber();
	abstract void deposit();
	abstract void withDrawl();
	abstract void rateOfInterest();
}

abstract class BankCreat{
	abstract void accountCreation();
}


class Savings1 extends BankCreat implements Bank1{
	
	Scanner sc = new Scanner(System.in);
	private long accountNumber, accountNum;
	private float amount, withDraw;
	private String name;
	private int age;
	@Override
	void accountCreation() {
		System.out.println("Enter Your Name: ");
		name = sc.nextLine();
		System.out.println("Enter Your Age:");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your Desired Account Number which is to be assigned to your Bank Account: ");
		accountNumber = sc.nextLong();
		System.out.println("!! Successfully Created Your Bank Account, Welcome to XYZ Bank !!"+name+"\nYour Account Number is: "+accountNumber);
		
	}
	@Override
	public void bankAccountNumber() {
		// TODO Auto-generated method stub
		System.out.println("Please Enter the Account Number: ");
		accountNum = sc.nextLong();
		if(accountNum!=accountNumber) {
			System.out.println("Invalid Account Number");
			System.exit(1);
		}
		else {
			System.out.println("Credentials Matched, Yay!!"+name);
		}
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		bankAccountNumber();
		System.out.println("Enter The Amount To Be Deposited Into Your Bank Account: ");
		amount = sc.nextFloat();
		System.out.println("The Sum Rs. "+amount+" is Deposited into Your Bank Account Number "+accountNumber+" "+name);
	}

	@Override
	public void withDrawl() {
		// TODO Auto-generated method stub
		bankAccountNumber();
		System.out.println("Enter the Amount to be Withdrawn: ");
		withDraw = sc.nextFloat();
		if(withDraw>amount || (amount-withDraw)<5000) {
			System.out.println("The Amount Which You Want To Draw is more than Withdrawl or Against Our Minimum Balance Policy!!!");
			System.exit(1);
		}
		else {
			amount -=withDraw;
			System.out.println("The Amount Withdrawl is Succesfull, Your New Balance is: "+amount);
		}
	}

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("The Annual Rate Of Interest For Your Account is: 6.6%");
	}
	
}




public class InterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Savings1 s1 = new Savings1();
		char choice;
		System.out.println("Do You Wish To Create Account in this XYZ Bank(Y/N): ");
		choice = sc.next().charAt(0);	
		sc.nextLine();
		if(choice =='Y'||choice=='y') {
			
			while(true) {
				System.out.println("Enter The Choice \n1.Account Creation.\n2.Deposit.\n3.Withdrawl: ");
				int l = sc.nextInt();
				switch(l) {
					case 1:
						s1.accountCreation();
						break;
					case 2:
						s1.deposit();
						break;
					case 3:
						s1.withDrawl();
						break;
				}
				if(l>3) {
					break;
				}
			}
		}
		else {
			System.out.println("Thanks For Visiting Our XYZ Banks, Hope You Have a Nice Day");
		}

	}

}
