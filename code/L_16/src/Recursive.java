import java.util.LinkedList;

public class Recursive {

    static LinkedList<LinkedList<Integer>> arrangement(
            LinkedList<Integer> input,
            LinkedList<Integer> output){
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();

        if (input.isEmpty()){
            LinkedList<Integer> copyOutput = new LinkedList<>(output);
            res.add(copyOutput);
            return res;
        }
        else {
            for (int i = 0; i < input.size(); i++) {
                int a = input.remove(i);
                output.add(a);
                res.addAll(arrangement(input, output));
                input.add(i, a);
                output.remove(output.size()-1);
            }
            return res;
        }
    }

    static void arrangement0(
            LinkedList<Integer> input,
            LinkedList<Integer> output,
            LinkedList<LinkedList<Integer>> res){

        if (input.isEmpty()){
            LinkedList<Integer> copyOutput = new LinkedList<>(output);
            res.add(copyOutput);
        }
        else {
            for (int i = 0; i < input.size(); i++) {
                int a = input.remove(i);
                output.add(a);
                arrangement0(input, output, res);
                input.add(i, a);
                output.remove(output.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }

//        LinkedList<LinkedList<Integer>> res = arrangement(list, new LinkedList<Integer>());
//        System.out.println(res);

        LinkedList<LinkedList<Integer>> res = new LinkedList<>();
        arrangement0(list, new LinkedList<Integer>(), res);
        System.out.println(res);

    }
}