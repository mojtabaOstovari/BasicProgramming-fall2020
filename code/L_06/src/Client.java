import java.util.Arrays;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        int n = scan.nextInt();
//
//        int i = 2;
//        int s = 0;
//
//        boolean f = true;
//        while (i<=n && f){
//            if(n%i==0){
//                f = false;
//                s = i;
//            }
//            i = i + 1;
//        }
//
//        System.out.println(s);


//        int i = 2;
//        boolean f = true;
//        while (i<=Math.sqrt(n) && f){
//            if(n%i==0){
//                f = false;
//            }
//            i = i + 1;
//        }
//
//        if(f){
//            System.out.println("it's prime");
//
//        }
//        else {
//            System.out.println("it's not prime");
//        }

//
//        int i = s.length() - 1;
//        while (i>=0){
//            System.out.println(s.charAt(i));
//            i = i - 1;
//        }

//        String s = scan.nextLine();
//        String p = scan.nextLine();
//
//        int i = 0;
//        boolean f = true;
//        while (i < s.length() - 1 && f){
//            if(s.charAt(i)==p.charAt(0) && s.charAt(i+1)==p.charAt(1)){
//                System.out.println("yes");
//                f = false;
//            }
//            i = i + 1;
//        }
//        if(f){
//            System.out.println("no");
//        }

//        int[] A = new int[10];
//        int[] B = new int[]{1, 5, 7, 8, 4, 4, 5, 0, 1, 0};
//
//        A[0] = 5;
//        A[3] = A[0] + 2;
//
//        int i = 0;
//        while (i<A.length){
//            System.out.println(A[i]);
//            i = i + 1;
//        }

        int n = scan.nextInt();
        int[] A = new int[n];
        int i = 0;
        while (i<n){
            A[i] = scan.nextInt();
            i = i+1;
        }

        int j = 0;
        int max = A[0];
        while (j<n){
            if(A[j]>max){
                max = A[j];
            }
            j = j + 1;
        }

    }
}
