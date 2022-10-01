public class MethodEx5 {

    public static int SumOfIntegers(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        // System.out.println("sum of integers is " + sum);
        return sum;

    }

    public static void main(String[] args) {
        int sum = SumOfIntegers(153);
        System.out.println("sum of integers is " + sum);

    }

}
