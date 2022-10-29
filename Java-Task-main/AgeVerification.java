import java.util.Scanner;

public class AgeVerification {
    public void voterOrNot(int age){
        if(age>=18){
            System.out.println("The Person Can Vote");
        } else if(age<0){
            System.out.println("The Age is Invalid");
        }
        else{
            System.out.println("The Person Cannot Vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AgeVerification av = new AgeVerification();

        System.out.println("Enter the Age:");
        int age = sc.nextInt();
        av.voterOrNot(age);
    }
}
