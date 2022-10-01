public class SubArrayMax {
    public static void maxSubArray(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {

                    System.out.print(number[k] + " ");
                    sum += number[k];
                }

                System.out.print(" " + " " + sum);
                System.out.println();
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }

        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        maxSubArray(number);
    }
}
