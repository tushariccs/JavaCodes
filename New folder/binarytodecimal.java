public class binarytodecimal {
    public static void DectoBin(int binum) {
        int decimalno = 0;
        int LD;
        int pow = 0;
        while (binum > 0) {
            LD = binum % 10;
            decimalno = decimalno + (LD * (int) Math.pow(2, pow));
            pow++;
            binum = binum / 10;

        }
        System.out.println(decimalno);
    }

    public static void main(String[] args) {
        DectoBin(1111111111);// binary no for int is from 0 to 1023
    }

}
