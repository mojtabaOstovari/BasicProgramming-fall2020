import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[] A1 = new int[]{1, 5, 8, 7};
        int[] A2 = new int[]{1, 2, 8, 7};
        int[] A3 = new int[]{1, 5, 8, 0};

        int[][] B = new int[][]{
                {1, 5, 8, 7},
                {1, 2, 8},
                {1, 5, 8, 0, 5}
        };

        Scanner scanner = new Scanner(System.in);

//        for (int i = 0; i < B.length; i++) {
//            for (int j = 0; j < B[i].length; j++) {
//                B[i][j] = scanner.nextInt();
//            }
//        }

        int[][] M1 = new int[][]{
                {1, 5, 8},
                {1, 2, 8},
                {1, 5, 8}
        };

        int[][] M2 = new int[][]{
                {1, 5, 8, 0},
                {0, 3, 8, 5},
                {1, 1, 8, 0}
        };

        int [][] M3 = new int[M1.length][M1[0].length];

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[0].length; j++) {
                M3[i][j] = M1[i][j] + M2[i][j];
            }
        }

//        for (int i = 0; i < M3.length; i++) {
//            for (int j = 0; j < M3[i].length; j++) {
//                System.out.print(M3[i][j] + " ");
//            }
//            System.out.println();
//        }
        int i = 0;
        String s = "((())()))())))";


    }
}
