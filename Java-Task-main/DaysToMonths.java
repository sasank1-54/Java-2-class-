import java.util.Scanner;

public class DaysToMonths {

    public void daysToMonths(int day)
    {
        int months = day/30;
        int days = day%30;
        System.out.println("There are "+months+" Months and "+days+" Days");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DaysToMonths dtm = new DaysToMonths();

        System.out.println("Enter the No of days: ");
        int day = sc.nextInt();

        dtm.daysToMonths(day);
    }

}
