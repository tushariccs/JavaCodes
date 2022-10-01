import java.util.*;

public class Ch7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("adult");
        }
        else if (a > 13 && a < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("not adult");
        }
        sc.close();
    }

}
