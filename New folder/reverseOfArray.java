public class reverseOfArray {
    public static void revOfArray(int numbers[]) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 15, 16 };
        revOfArray(number);

    }

}
