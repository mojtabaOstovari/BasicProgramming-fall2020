import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan0 = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        char s = scan.next().charAt(0);
        char s1 = scan.next().charAt(0);
        char s2 = scan.next().charAt(0);

        System.out.println(s + " " + s1 + " " + s2);

        String s5 = scan.nextLine();
        System.out.println(s);

        int a = scan0.nextInt();
        int b = scan0.nextInt();
        String str = scan0.nextLine();

        System.out.println(str + " " + a + " " + b);
    }
}
