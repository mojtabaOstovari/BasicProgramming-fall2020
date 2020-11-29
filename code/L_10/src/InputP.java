import java.util.Arrays;
import java.util.Scanner;

public class InputP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b;
        int[] A = new int[0];
        int [] B = new int[0];
        int [] T = new int[0];
        first_loop : for(int i = 1; ;i++){
            b = scanner.nextInt();
            if (b<0){
                if(i%2==0){
                    System.out.println(Arrays.toString(B));
                }
                else {
                    System.out.println(Arrays.toString(A));
                }
                break;
            }
            if(i%2==1) {
                B = new int[i];
                for (int j = 0; j < A.length; j++) {
                    B[j] = A[j];
                }
                B[i-1] = b;
                T = B;
            }
            if(i%2==0){
                A = new int[i];
                for (int j = 0; j < B.length; j++) {
                    A[j] = B[j];
                }
                A[i-1] = b;
                T = A;
            }

            for (int j = 0; j < T.length; j++) {
                for (int k = j + 1; k < T.length; k++) {
                    for (int l = k + 1; l < T.length; l++) {
                        if (T[j] + T[k] + T[l] == 15){
                            System.out.println(T[j] + " + " + T[k] + " + " + T[l]);
                            break first_loop;
                        }
                    }
                }
            }

        }

    }


}
