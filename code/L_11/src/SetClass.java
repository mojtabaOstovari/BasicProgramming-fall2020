import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class SetClass {

    static int sum(int a, int b){return a+b;}
    static double sum(double a, double b){return a+b;}

    static int[] sortArray(int[] B){
        int[] A = B;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(A[i] > A[j]){
                    int t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
            }
        }
        return A;
    }

    static int[] deleteArrayIndex(int[] B, int index){
        int[] B1 = new int[B.length-1];
        for (int i = 0; i < index; i++) {
            B1[i] = B[i];
        }
        for (int i = index + 1; i < B.length; i++) {
            B1[i-1] = B[i];
        }

        return B1;
    }

    static int[] arrayToSet(int[] A){
        int[] sortedA = sortArray(A);
        int[] A1 = sortedA;
        int count = 0;
        for (int i = 0; i < sortedA.length-count - 1; i++) {
            if (A1[i] == A1[i+1]) {
                A1 = deleteArrayIndex(A1, i);
                count++;
                i--;
            }
        }

        return A1;

    }

    static int[] unionSet(int[] A, int[] B){
        int[] U = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            U[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            U[A.length + i] = B[i];
        }

        return arrayToSet(U);

    }

    static int[] addSet(int[] A, int a){
        return unionSet(A, new int[]{a});
    }


    public static void main(String[] args) {

        int[] A1 = {1, 5, 3, 6, 1, 2, 2, 6, 0, 1, 1, 5};
        int[] A2 = {1, 5, 3, 6, 1, 2, 2, 6, 0, 1,};
        int[] A3 = {1, 5, 3, 6, 1, 2, 2, 6, 0, 1, 5};
        int[] A4 = {1, 5, 3, 6, 1,6, 0, 1, 1, 5};
        int[] A5 = {1, 5, 3, 6, 6, 0, 1, 1, 5};

        int[] A6 = arrayToSet(A1);

        //System.out.println(Arrays.toString(A6));

        int[] A7 = {1, 5, 3, 6};
        int[] A8 = A7;
        A7[0] = 9;
        System.out.println(Arrays.toString(A7));
        System.out.println(Arrays.toString(A8));

        int e = 5;
        int e1 = e;
        e = 9;
        System.out.println(e);
        System.out.println(e1);

    }
}
