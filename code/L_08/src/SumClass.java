import java.util.Scanner;

public class SumClass {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int m = scan.nextInt();
//         int i = m;
//         int sum = 0;
//         while (i<=n){
//             sum = sum + (i*i*i) + 2*(i*i);
//             i++; // i = i + 1;
//         }
//        System.out.println(sum);

//        i--; // i = i - 1;
//
//        i = i + 5; // i+=5;
//        i = i - 5; // i-=5;
//        i = i * 5; // i*=5;

        int sum = 0;

        for (int i = m; i<=n; i++){
            sum = sum + (i*i*i) + 2*(i*i);
        }

        System.out.println(sum);

    }
}
