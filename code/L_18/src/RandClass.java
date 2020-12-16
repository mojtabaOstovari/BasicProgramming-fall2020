import java.util.Arrays;
import java.util.Random;

public class RandClass {
    public static void main(String[] args) {

        int n = 100000000;
        int m = 10;
        Random random = new Random();
//        int[] A = new int[m];
//        for (int i = 0; i < n; i++) {
//            int a = random.nextInt(m);
//            A[a]++;
//        }
//
//        System.out.println(Arrays.toString(A));

        int c = 0;
        for (int i = 0; i < n ; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if ((x*x)+(y*y)<=1){
                c++;
            }
        }

        double P = 4 * c/(double)n;
        System.out.println(P);

    }
}
