import java.util.Scanner;

public class Insurance {
    public void giveInsurance( String val, int age){
        if(val.equals("married")){
            System.out.println("Yes eligible");
        }

        else if(val.equals("unmarried male") && age>30){
            System.out.println("Yes He is eligible");
        }
        else if (val.equals("unmarried female") && age>25) {
            System.out.println("Yes She is eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Insurance ig = new Insurance();

        System.out.println("Enter whether the person is married or not: ");
        String val = sc.nextLine();
        if(val.equals("married")){
            ig.giveInsurance(val, 0);
        }
        else{
            System.out.println("Enter the age:");
            int age = sc.nextInt();
            ig.giveInsurance(val, age);
        }
    }
}
