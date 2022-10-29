import java.util.Scanner;

public class Arithmetic {

    public void add( int a, int b){
        //addition
        int c = a+b;
        System.out.println("Sum of the given two number is: "+c);

    }

    public void sub( int a, int b){
        //Subtraction
        int c = a-b;
        System.out.println("The Difference Between the given two numbers is: "+c);

    }

    public void mul( int a, int b){
        //Multiplication
        int c = a*b;
        System.out.println("The Product of the given two number is: "+c);

    }

    public void div( int a, int b){
        //Division
        float c = (float)a/b;
        System.out.println("The Fractional value of a/b is: "+c);

    }

    public void rem( int a, int b){
        //Modulo_Division or Reminder
        int c = a%b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice of Operation to perform: \n1.Addition.\n2.Subtraction.\n3.Multiplication.\n4.Division.\n5.Reminder Operation");
        int choice = sc.nextInt();
        Arithmetic ar = new Arithmetic();
        System.out.println("Enter any Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (choice){
           case 1:
               ar.add(a,b);
               break;
           case 2:
               ar.sub(a,b);
               break;
           case 3:
               ar.mul(a,b);
               break;
           case 4:
               ar.div(a,b);
               break;
           case 5:
               ar.rem(a,b);
               break;
           default:
               System.out.println("Please Enter the proper Value!");
               break;
        }
    }
}
