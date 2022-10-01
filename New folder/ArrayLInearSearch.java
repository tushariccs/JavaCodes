import java.util.*;

public class ArrayLInearSearch {
    public static int LinearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (key == number[i]) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = 20;
        int a = LinearSearch(arr, key);
        if (a == 1) {
            System.out.println("Element found");
            System.out.println("The key is found at index: " + a);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }

}
