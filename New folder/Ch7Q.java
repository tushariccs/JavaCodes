import java.util.*;

public class Ch7Q {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // if (a > 0) {
        // System.out.println("Positive");
        // } else {
        // System.out.println("Negative");
        // }
        // sc.close();

        // if (a >= 100) {
        // System.out.println("You have a fever visit a doctor");
        // } else {
        // System.out.println("You are fine");
        // }
        // switch (a) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("None");
        // }

        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println(y);
        // System.out.println(x);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leapyear");
        }

    }
}
