
//All loops concept
import java.util.*;

public class ch8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int lastdigit;
        // int rev = 0;
        // while (a > 0) {
        // lastdigit = a % 10;
        // // System.out.print(lastdigit);
        // rev = (rev * 10) + lastdigit;
        // a /= 10;
        // }
        // System.out.println(rev);

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello World");
        // i += 2;

        // int a = sc.nextInt();
        // int lastdigit;
        // int sum = 0;
        // if (a % 2 == 0) {
        // while (a > 0) {
        // lastdigit = a % 10;
        // sum += lastdigit;
        // a /= 10;
        // }
        // System.out.println(sum);

        // } else if (a % 2 == 1) {
        // while (a > 0) {
        // lastdigit = a % 10;
        // sum += lastdigit;
        // a /= 10;
        // }
        // System.out.println(sum);
        // }

        // int fact = 15;
        Scanner sca = new Scanner(System.in);
        int a = sc.nextInt();
        // for (int i = 1; i <= a; i++) {
        // fact = fact * i;
        // }
        // System.out.println(fact);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * a);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("***");
        }
        sca.close();

        sc.close();
    }

}
