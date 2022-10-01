import java.util.Scanner;

public class MethodEx2 {
    public static boolean EvenOrOdd(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests to run");
        int n = sc.nextInt();
        if (EvenOrOdd(n)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        boolean ans = Test();
        System.out.println(ans);
    }

}
