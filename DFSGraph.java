import java.util.*;

public class DFSGraph {
    private int V;
    private LinkedList<Integer>[] adj;

    // Constructor to initialize graph
    DFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add directed edge from u to v
    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    // Recursive DFS utility
    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // DFS traversal from starting vertex
    void DFS(int v) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal starting from vertex " + v + ": ");
        DFSUtil(v, visited);
        System.out.println(); // newline after traversal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();

        // Input number of edges
        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();

        DFSGraph g = new DFSGraph(V);

        // Input edges
        System.out.println("Enter each edge in the format: <source> <destination>");
        for (int i = 0; i < E; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            if (u < 0 || u >= V || v < 0 || v >= V) {
                System.out.println("❌ Invalid edge: (" + u + ", " + v + "). Vertex index must be between 0 and " + (V - 1));
                i--; // retry this edge
            } else {
                g.addEdge(u, v);
            }
        }

        // Input starting vertex for DFS
        System.out.print("Enter the starting vertex for DFS traversal: ");
        int start = sc.nextInt();

        if (start < 0 || start >= V) {
            System.out.println("❌ Invalid starting vertex. Must be between 0 and " + (V - 1));
        } else {
            g.DFS(start);
        }

        sc.close();
    }
}