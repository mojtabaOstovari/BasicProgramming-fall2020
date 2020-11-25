import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n0 = scan.nextInt();
        int n = n0;
        int m = 0;
        while (n>0){
            int a = n%10;
            m = (10*m) + a;
            n = n/10;
            System.out.println("n: " + n + ", a: " + a + ", m: " + m);
        }

        if(n == m){
            System.out.println("yes");
        }

        System.out.println(m);

    }
}
