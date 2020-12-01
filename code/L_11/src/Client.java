import java.util.Scanner;

public class Client {

    static int sum(int a, int b){
        int s = a+b;
        return s;
    }

    static int[][] matrixSum(int[][] M1, int[][] M2){
        int[][] S = new int[M1.length][M1[0].length];
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[0].length; j++) {
                S[i][j] = M1[i][j] + M2[i][j];
            }
        }
        return S;
    }

    static boolean matrixSumable(int[][] M1, int[][] M2){
        if (M1.length == M2.length && M1[0].length == M2[0].length){
            return true;
        }
        else {
            return false;
        }
    }

    static int[][] matrixScan(int m, int n){
        Scanner scanner = new Scanner(System.in);
        int[][] S = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                S[i][j] = scanner.nextInt();
            }
        }
        return S;
    }

    static void matrixShow(int[][] M1){
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[0].length; j++) {
                System.out.print(M1[i][j] + " ,");;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        int[][] M1 = new int[][]{
//            //   1  2  3
//                {1, 5, 0},
//                {1, 0, 1},
//                {0, 0, 1}
//        };
//        int[][] M2 = new int[][]{
//                //   1  2  3
//                {1, 0, 0},
//                {1, 1, 1},
//                {0, 0, 1}
//        };
//        int t = sum(5, 7);
//
//        System.out.println(sum(5, 7));
        int [][] M0 = matrixScan(2, 3);
        int[][] M3;

        if(matrixSumable(M0, M0)){
            M3 = matrixSum(M0, M0);
            matrixShow(M3);
        }
        else {
            System.out.println("i cant do it");
        }

        int [][] M4 = matrixScan(5, 3);




    }




}
