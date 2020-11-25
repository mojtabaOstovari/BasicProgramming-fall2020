import java.util.Arrays;
import java.util.Scanner;

public class SearchClass {
    public static void main(String[] args) {
        int A[] = new int[]{1, 5, 3, 2, 0, 7};

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (A[j]<A[i]){
                    int t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
            }
        }

        System.out.println(Arrays.toString(A));

        int a = 5;
        int b = 6;

        int c = a;
        a = b;
        b = c;

        Scanner scan = new Scanner(System.in);
        String[] SA = new String[10];
        for (int i = 0; i < 10; i++) {
            SA[i] = scan.next();
        }

        int ii = Integer.valueOf("26515151");

        }

    }
}
