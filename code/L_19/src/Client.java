import package1.A;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Color c1 = new Color(10, 84, 5);
        Rectangle r1 = new Rectangle("rec1", 3, 5, c1);
        Rectangle r2 = new Rectangle();

        double a = r1.area();

        Rectangle[] R = Rectangle.rectanglesConstructor(5, scanner);
        //System.out.println(Arrays.toString(R));
        System.out.println(R[0].toString());

        A aa = new A();
    }
}
