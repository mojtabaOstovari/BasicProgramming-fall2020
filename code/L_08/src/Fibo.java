import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        int [] A = new int[n];
//        A[0] = 0; A[1] = 1;
//        for (int i = 2; i < n; i++) {
//            A[i] = A[i-1] + A[i-2];
//        }
//
//        System.out.print(A[0]);
//        for (int i = 1; i < n; i++) {
//            System.out.print(" ," + A[i]);
//        }
        int p1 = 0;
        int p2 = 1;
        int p3;
        System.out.print(p1 + " ," + p2 + " ,");
        for(int i=0; i<n; i++){
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
            System.out.print(p3 + " ,");
        }



    }
}
