import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;


public class Graph {

    static LinkedList<LinkedList<Integer>> createGraph(int n){
        LinkedList<LinkedList<Integer>> graph = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new LinkedList<Integer>());
        }
        return graph;
    }

    static void addEdge(LinkedList<LinkedList<Integer>> graph, int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void main(String[] args) {

        LinkedList<LinkedList<Integer>> graph = createGraph(6);

        addEdge(graph, 2, 3);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 4, 2);
        addEdge(graph, 4, 5);

        System.out.println(graph);



    }
}

