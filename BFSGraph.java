import java.util.*;

public class BFSGraph {
    private final int V;
    private final LinkedList<Integer>[] adj;

    // Constructor to initialize graph
    BFSGraph(int v) {
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

    // Perform BFS traversal from starting vertex s
    void BFS(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);

        System.out.print("BFS Traversal starting from vertex " + s + ": ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int n : adj[node]) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
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

        BFSGraph g = new BFSGraph(V);

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

        // Input starting vertex for BFS
        System.out.print("Enter the starting vertex for BFS traversal: ");
        int start = sc.nextInt();

        if (start < 0 || start >= V) {
            System.out.println("❌ Invalid starting vertex. Must be between 0 and " + (V - 1));
        } else {
            g.BFS(start);
        }

        sc.close();
    }
}