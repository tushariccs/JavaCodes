public class SubArray {
    public static void printSubArray(int number[]) {
        int tp = 0;
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

                tp++;
                System.out.print(" " + " " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total of subarrays: " + tp);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printSubArray(number);
    }

}
