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

    static void bfs(LinkedList<LinkedList<Integer>> graph, int v){
        boolean[] visited = new boolean[graph.size()];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        System.out.println(v);
        int[] rank = new int[graph.size()];
        rank[v] = 1;

        while (!queue.isEmpty()){
            int u = queue.get(0);
            queue.remove(0);
            for (int x : graph.get(u)) {
                if (!visited[x]){
                    queue.add(x);
                    visited[x] = true;
                    System.out.println(x);
                    rank[x] = rank[u] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(rank));
    }

    public static void main(String[] args) {

        LinkedList<LinkedList<Integer>> graph = createGraph(12);

        addEdge(graph, 2, 3);
        addEdge(graph, 0, 3);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 4);
        addEdge(graph, 4, 2);
        addEdge(graph, 1, 5);
        addEdge(graph, 7, 6);

        System.out.println(graph);

        bfs(graph, 3);

    }
}

