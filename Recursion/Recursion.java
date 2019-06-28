package Recursion;

public class Recursion {
    public static void main(String[] args) {
        counter(3);
        System.out.println(factorial(5) );
    }

    private static void counter(int n) { //стэк
        if (n == 0)
            return;

        System.out.println(n);
        counter(n-1);
    }

    private static int factorial(int k) {
        if (k == 1)
            return 1;

        return k * factorial(k-1);
    }
}
