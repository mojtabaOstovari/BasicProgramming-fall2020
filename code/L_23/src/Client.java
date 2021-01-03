import java.util.*;

public class Client {
    public static void main(String[] args) {
        A b = new B();
        Headphone h = new Headphone(5, "sd", 5, 5, "ds", 5, "ds");
        System.out.println(print(h));
    }

    List<Integer> l = new ArrayList<>();
    Map<Integer, Integer> m = new HashMap<>();


    static String print(Product product){
        return product.name + ": " + product.price;
    }
}

class A{
    int p;

}

class B extends A{
    int q;

}

