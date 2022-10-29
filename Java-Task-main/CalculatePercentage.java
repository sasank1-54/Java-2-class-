package JavaTask;
import java.util.Scanner;
public class CalculatePercentage {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double m1,m2,m3;
			String name;
			System.out.println("Enter the Name of the Student: ");
			name = sc.nextLine();
			System.out.println("Enter the 1st subject marks: ");
			m1 = sc.nextDouble();
			System.out.println("Enter the 2nd subject marks: ");
			m2 = sc.nextDouble();
			System.out.println("Enter the 3rd subject marks: ");
			m3 = sc.nextDouble();
			if(m1<0 || m2<0 || m3<0 || m1>100 || m2>100 || m3>100) {
				System.out.println("Invalid Marks please give proper input");
				System.exit(1);
			}
			
			double result = (m1+m2+m3)/3.0f;
			System.out.println(result);
			
			if(result<=100 && result>=80) {
				System.out.println(name+" has got A grade");
			}
			else if(result<=79 && result>=60) {
				System.out.println(name+" has got B grade");
			}
			else if(result<=59 && result>=50) {
				System.out.println(name+" has got C grade");
			}
			else if(result<=49 && result>=40){
				System.out.println(name+" has got D grade");
			}
			else {
				System.out.println(name+" has failed the exam!");
			}
		}
	}

}
