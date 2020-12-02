import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Coll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> mySet1 = new HashSet<Integer>();
        mySet1.add(5);mySet1.add(3);mySet1.add(2);mySet1.add(5);mySet1.add(3);

        HashSet<Integer> mySet2 = new HashSet<Integer>();
        mySet2.add(1);mySet2.add(3);mySet2.add(3);mySet2.add(5);mySet2.add(4);

        System.out.println(mySet1);
        System.out.println(mySet2);

//        for (int i = 0; i < 4; i++) {
//            mySet1.add(scanner.nextInt());
//        }

        //boolean b = mySet1.contains(1);
        //System.out.println(b);

        //boolean b1 = mySet1.isEmpty();

        //System.out.println(mySet1.size());

        //mySet1.addAll(mySet2);

        //boolean b = mySet1.containsAll(mySet2);

        //mySet1.retainAll(mySet2);
        //mySet1.removeAll(mySet2);
        //System.out.println(mySet1);

//        Iterator<Integer> iterator = mySet1.iterator();
//
//        int sum = 0;
//        while (iterator.hasNext()){
//            Integer a = iterator.next();
//            sum += a;
//            System.out.println(a);
//        }
//        System.out.println(sum);

//        for(Integer i: mySet1){
//            System.out.println(i);
//        }

        int[] A = {2,8,9};

        for (int i : A) {
            System.out.println(i);
        }

    }
}
