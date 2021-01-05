import java.awt.print.Printable;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Headphone h = new Headphone(5, "sd", 5, 5, "ds", 5, "ds");
        System.out.println(print(h));
        LinkedList<Savable> ls = new LinkedList<>();
        ls.add(h);
    }

    List<Integer> l = new ArrayList<>();
    Map<Integer, Integer> m = new HashMap<>();


    static String print(Product product){
        return product.name + ": " + product.price;
    }
}


