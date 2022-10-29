import java.util.Scanner;

public class TriangleOrNot {

    public void verify(int a, int b, int c){
        if((a+b)>c){
            System.out.println("These are the sides of a triangle");
        }
        else if((a+c)>b){
            System.out.println("These are the sides of a triangle");
        }
        else if ((b+c)>a){
            System.out.println("These are the sides of a triangle");
        }
        else{
            System.out.println("These are not the sides of a triangle");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TriangleOrNot ton  = new TriangleOrNot();

        System.out.println("Enter the Sides of the Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ton.verify(a,b,c);
    }
}
