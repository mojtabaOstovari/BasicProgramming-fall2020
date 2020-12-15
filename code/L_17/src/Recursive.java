import java.util.LinkedList;

public class Recursive {

    static void min(int[] A, int index, int minIndex){
        if (index == A.length){
            System.out.println(A[minIndex]);;
        }
        else {
            if(A[index] < A[minIndex]){
                min(A, index+1, index);
            }
            else {
                min(A, index+1, minIndex);
            }
        }
    }

    static void f(int n, LinkedList<Integer> list){
        if (n == 0){
            System.out.println(list);
        }
        else {
            int a = list.get(list.size()-1);
            if (a == 0){
                list.add(1);
                f(n-1, list);
                list.remove(list.size()-1);
            }

            list.add(0);
            f(n-1, list);
            list.remove(list.size()-1);

        }



    }

    static void g(int n, int start, LinkedList<Integer> list){
        if (n==0){
            System.out.println(list);
        }
        else {
            for (int i = start; i <= n; i++) {
                list.add(i);
                g(n-i, i + 1,list);
                list.remove(list.size()-1);
            }
        }
    }

    static void c(int n, int k, int start, int[] input, LinkedList<Integer> output){

        if(0 == k){
            System.out.println(output);
        }
        else {
            for (int i = start; i < n-k+1 ; i++) {
                output.add(input[i]);
                c(n,  k-1, i+1, input, output);
                output.remove(output.size()-1);
            }
        }
    }


    public static void main(String[] args) {

       int[] A = {1, 2, 3, 4, 5};
       // min(A, 0, 0);
        LinkedList<Integer> l = new LinkedList<>();
        //l.add(1);
        //f(5, l);
        //g(10, 1, new LinkedList<Integer>());

        c(5, 3, 0, A, new LinkedList<Integer>());


    }
}
