//import java.util.Scanner;

public class binomial {

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        // System.out.println(f);
        return f;
    }

    static int binomial1(int n, int r) {

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n - r);

        int binomial = n_fact / (r_fact * (nr_fact));
        // System.out.println(binomial);
        return binomial;

    }

    public static void main(String[] args) {
        int binomial = binomial1(5, 2);
        System.out.println(binomial);

    }

}
