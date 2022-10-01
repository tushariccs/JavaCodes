public class DecimaltoBinary {
    public static void DectoBin(int n) {
        int myNum = n;
        int pow = 0;
        int binarynumber = 0;
        while (n > 0) {
            int rem = n % 2;
            binarynumber = binarynumber + (rem * (int) (Math.pow(10, pow)));
            pow++;
            n = n / 2;

        }
        System.out.println("The binary  number for " + myNum + " = " + binarynumber);

    }

    public static void main(String[] args) {
        DectoBin(10);

    }

}
