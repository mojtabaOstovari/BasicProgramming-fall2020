import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        ArrayList<Integer> myList1 = new ArrayList<Integer>();
        myList1.add(10);
        myList.add(5);
        myList.add(7);
        myList.add(2);
        myList.add(7);

        System.out.println(myList);
        myList.set(2, 9);
        int t = myList.get(3);

        System.out.println(myList);

        //myList.remove(0);

        boolean b1 = myList.isEmpty();
        int si = myList.size();

        System.out.println(myList.indexOf(5));

        boolean b = myList.retainAll(myList1);
        System.out.println(myList);

        Integer[] myArray = new Integer[myList.size()];
        myList.toArray(myArray);

        Integer[] spam = new Integer[] { 5, 2, 8 };
        List<Integer> list = Arrays.asList(spam);

        for (Integer i : list) {
            System.out.println(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = 0; i < spam.length; i++) {
            System.out.println(spam[i]);
        }

    }
}
