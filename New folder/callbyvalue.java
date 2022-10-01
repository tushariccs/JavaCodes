class callbyvalue {

    static int product(int a, int b) {
        // copy is stored in int a,b
        // below main a and b are different from this a and b;
        // it will not affect below a and b values
        System.out.println("product: " + a + "*" + b + "=" + a * b);
        return a * b;
    }

    public static void main(String[] args) {
        // Java is always called by call by value
        int a = 10;
        int b = 20;
        int c = product(a, b);// copy of this is transfer to above product function
        // if this excecutes and there is a print statement then it will give the
        // desired output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // o/p is 10 and 20;

    }
}