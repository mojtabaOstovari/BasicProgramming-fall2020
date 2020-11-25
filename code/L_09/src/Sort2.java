import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        int[] A = {5, 10, 0, 1, 7, 8};

        int f = 0;
        int p = 0;
        for (int i = 1; i < A.length; i++) {
            int tt = A[i];
            boolean b = true;
            for (int j = 0; (j < i) && b; j++) {
                if (A[i] < A[j]) {
                    b = false;
                    for (int k = i; k > j; k--) {
                        A[k] = A[k - 1];
                    }
                    A[j] = tt;
                }
            }

        }

        System.out.println(Arrays.toString(A));


    }
}
