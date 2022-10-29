import java.util.Scanner;

public class Area {
    public void circleArea( int r){
        //Circle_Area
        int area = (22/7)*r*r;
        System.out.println("The Area of the Circle is: "+area);

    }

    public void squareArea(double s){
        //Square_Area
        double area = Math.pow(s,2);
        System.out.println("The Area of the Square is: "+area);

    }
    public void TriangleArea(int b, int h){
        //Triangle_Area
        float area = (float)0.5*b*h;
        System.out.println("The Area of the Triangle is: "+area);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area ar = new Area();

        System.out.println("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        ar.circleArea(radius);

        System.out.println("Enter the Side of the Square: ");
        double side = sc.nextInt();
        ar.squareArea(side);

        System.out.println("Enter the base and height of the Right Angle Triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        ar.TriangleArea(base, height);
    }
}
