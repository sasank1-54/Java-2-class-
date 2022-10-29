import java.util.Scanner;

public class GrossSalary {

    public void totalSalary(int salary){
        int TA, DA, HRA, PF, Bonus;
        if(salary>20000){
            TA = salary*10/100;
            DA = salary*15/100;
            HRA = salary*20/100;
            PF = salary*12/100;
            Bonus = salary*10/100;
            int newsal= salary+TA+DA+HRA+Bonus-PF;
            System.out.println("The Gross Salary is: "+newsal);
        }
        else{
            TA = salary*10/100;
            DA = salary*15/100;
            HRA = salary*20/100;
            PF = salary*12/100;
            int newsal= salary+TA+DA+HRA-PF;
            System.out.println("The Gross Salary is: "+newsal);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GrossSalary gs = new GrossSalary();

        System.out.println("Enter the Basic Salary:");

        int basic = sc.nextInt();
        gs.totalSalary(basic);
    }
}
