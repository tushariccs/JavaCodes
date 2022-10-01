
public class MethodEx3 {
    public static int Palindrome(int n) {
        int pow = 0;
        int sum = 0;
        int new1 = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * ((int) (Math.pow(10, pow)));
            n = n / 10;
            pow++;
        }
        System.out.println(sum);
        if (new1 == sum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int i = Palindrome(121);
        System.out.println(i);
        // System.out.println("1 means success, 0 means failure " + i);
    }

}
