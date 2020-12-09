import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Recursive {

    static LinkedList<Integer> sortA(LinkedList<Integer> list){
        if (list.isEmpty()){
            return list;
        }
        // #1: {3, 2, 1} =
        // #2: {2, 1}, 3 = {1, 2, 3}
        // #3: {1}, 2 = {1, 2}
        // #4: {}, 1 = {1}

        else {
            int max = list.get(0);
            int m = 0;
            for (int i=0; i<list.size();i++) {
                if (list.get(i)>max){
                    max = list.get(i);
                    m = i;
                }
            }
            int c = list.remove(m);
            list = sortA(list);
            list.add(c);
            return list;
        }
    }

    static LinkedList<Integer> sortQ(LinkedList<Integer> list){
        if (list.isEmpty()){return list;}
        else {
            LinkedList<Integer> LeftList = new LinkedList<Integer>();
            LinkedList<Integer> RightList = new LinkedList<Integer>();
            int p = list.remove(0);
            for (int i : list) {
                if(i>=p){RightList.add(i);}
                else {LeftList.add(i);}
            }
            LeftList = sortQ(LeftList);
            RightList = sortQ(RightList);
            LeftList.add(p);
            LeftList.addAll(RightList);
            return LeftList;
        }
    }

    static void subset(LinkedList<Integer> input, LinkedList<Integer> output){
        if (input.isEmpty()){
            System.out.println(output);
        }
        else {

            int p = input.remove(0);
            subset(input, output);
            output.add(p);
            subset(input, output);

            output.remove(output.size()-1);
            input.add(0, p);

        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : A) {
            list.add(i);
        }

        // System.out.println(list);
        // System.out.println(sortQ(list));

        subset(list, new LinkedList<Integer>());

    }
}
