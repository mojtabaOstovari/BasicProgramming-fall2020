import java.util.HashMap;


public class MapClass {

    static void f(int a){
        a = a + 5;
        System.out.println(a);
    }

    static void g(Integer a){
        a = a + 5;
        System.out.println(a);
    }

    static void h(String s){
        s += "pi";
        System.out.println(s);
    }

    static void k(int[] a){
        a[0] = 7;
    }


    public static void main(String[] args) {
        //        String[] names = new String[10];
//        int[] numbers = new int[10];
//
//        names[0] = "Ali";
//        numbers[0] = 24524;
//
//        names[1] = "sara";
//        numbers[1] = 84724;

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Ali", 24524);
        myMap.put("sara", 84724);

        myMap.replace("Ali", 21558);

        //System.out.println(myMap.get("Ali"));

        myMap.size();
        // myMap.remove("Ali");

        for (String s : myMap.keySet()) {
            System.out.println(s + ": " + myMap.get(s));
        }

        boolean b = myMap.containsKey("hasan");
        boolean b1 = myMap.containsValue(21568);

//        int q = 5;
//        Integer p = new Integer(7); // Integer p = 7;
//        String ss = "Ali";
//
//        int[] A = {0, 0, 0, 0};
//        // f(q);
//        //g(p);
//        //h(ss);
//        k(A);
    }
}
