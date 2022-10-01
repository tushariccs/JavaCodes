public class ArrayLargest {
    public static int Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;// -infinity
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int Smallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;// +infinity;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 3, 5 };
        int a = Largest(arr);
        System.out.println("Largest number in array is " + a);
        int b = Smallest(arr);
        System.out.println("Smallest number in array is " + b);

    }

}
