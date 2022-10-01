//Pattern
public class Q9 {
    public static void main(String[] args) {
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int line = 1; line <= 4; line++) {
        // for (int number = 1; number <= line; number++) {
        // System.out.print(number);
        // }
        // System.out.println();
        // }

        int ch = 1;
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + ch);
                j = 0;
            }
            System.out.println();
        }
    }
}