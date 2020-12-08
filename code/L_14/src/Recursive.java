import java.util.LinkedList;

public class Recursive {

    static long factorial(int n){
        if (n == 0){
            return 1;
        }
        else {
            return factorial(n-1) * n;
            // factorial(5) = factorial(4) * 5 =
            // factorial(3) * 4 * 5 =
            // ...
            // factorial(0) * 1 * 2 * 3 * 4 * 5 =
        }
    }

    static int fibo(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }

    static double pow(double a, long b){
        double m = 1;
        for (long i = 0; i < b; i++) {
            m = m * a;
        }
        return m;
    }

    static double powR(double a, long b){
        if (b==0){return 1;}
        else {
            // (2, 16) = (2, 8), * = (2, 4), ** = (2, 2), *** = (2, 1), **** = (2, 0), *****
            double c = powR(a, b/2);
            if (b%2==0){
                return c * c;
            }
            else {
                return c * c * a;
            }
        }
    }

    public static void main(String[] args) {

        // System.out.println(factorial(5));
        // System.out.println(fibo(8));

        LinkedList<Integer> list = new LinkedList<>();

        double a = 1.00000000001;
        long b = 100000000000L;

        System.out.println(powR(2, 20));

    }
}
