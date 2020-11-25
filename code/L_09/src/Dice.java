import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

//        for (int i = 1; i < 7; i++) {
//            for (int j = 1; j < 7; j++) {
//                // System.out.println(i + " ," + j);
//                if(i+j>=m){
//                    System.out.println(i + " ," + j);
//                }
//            }
//        }

//        int a = 1;
//        int b = 1;
//        while(true){
//            System.out.println(a + " ," + b);
//            a++;
//            b++;
//        }

//        for (int i = 1; i < m; i++) {
//            for (int j = i; j < m; j++) {
//                for (int k = j; k < m; k++) {
//                    if ((i*i) + (j*j) == (k*k)){
//                        System.out.println(i + ", " + j + ", " + k);
//                    }
//                }
//            }
//        }


        int [] A = new int[m];


        for (int i = 1; i < m; i++) {
            for (int j = i; j < m; j++) {
                for (int k = j; k < m; k++) {
                    if (A[i] + A[j] + A[k] == 20){
                        System.out.println(i + ", " + j + ", " + k);
                    }
                }
            }
        }





    }
}
