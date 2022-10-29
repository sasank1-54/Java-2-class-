package JavaTask;

import java.util.Scanner;

class EmployeeCalc{
	
	private String name;
	private float hra =13, ta=10, da=12, sal;
	
	public EmployeeCalc(String name,int sal) {
		this.name = name;
		this.sal= sal;
	}
	public void displayDetails() {
		float gross = sal+(sal*hra/100)+(sal*ta/100)+(sal*da/100);
		
		System.out.print("          "+this.name+" ");
		System.out.println("                                  "+gross);
	}
}

public class EmployeeSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		EmployeeCalc arr[] = new EmployeeCalc[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+(i+1)+" Employee Name: ");
			String name = sc.nextLine();
			System.out.println("Enter the "+(i+1)+" Employee Salary: ");
			int basic = sc.nextInt();
			sc.nextLine();
			arr[i] = new EmployeeCalc(name, basic);
		}
		System.out.println("|         Employee Name           |           Employee Salary       |");
		for(EmployeeCalc i :arr) {
			i.displayDetails();
		}
	}
		
}
