import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        Color c1 = new Color(10, 84, 5);
        Rectangle r1 = new Rectangle("rec1", 3, 5, c1);
        Rectangle r2 = new Rectangle();

        double a = r1.area();

        System.out.println(Rectangle.count);

    }
}
