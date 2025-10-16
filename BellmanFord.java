import java.util.*;

class Edge {
    int u, v, w;
    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}

public class BellmanFord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of vertices and edges
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        Edge[] edges = new Edge[E];

        // Input: edge list
        System.out.println("Enter each edge in the format: <source> <destination> <weight>");
        for (int i = 0; i < E; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            edges[i] = new Edge(u, v, w);
        }

        // Input: source vertex
        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();

        // Initialize distances
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Bellman-Ford relaxation
        for (int i = 1; i < V; i++) {
            for (Edge e : edges) {
                if (dist[e.u] != Integer.MAX_VALUE && dist[e.u] + e.w < dist[e.v]) {
                    dist[e.v] = dist[e.u] + e.w;
                }
            }
        }

        // Check for negative weight cycle
        boolean hasNegativeCycle = false;
        for (Edge e : edges) {
            if (dist[e.u] != Integer.MAX_VALUE && dist[e.u] + e.w < dist[e.v]) {
                hasNegativeCycle = true;
                break;
            }
        }

        System.out.println("\n--- Bellman-Ford Result ---");
        if (hasNegativeCycle) {
            System.out.println("Negative weight cycle detected. Shortest paths not reliable.");
        } else {
            for (int i = 0; i < V; i++) {
                if (dist[i] == Integer.MAX_VALUE) {
                    System.out.println("Distance from " + src + " to " + i + " = INF");
                } else {
                    System.out.println("Distance from " + src + " to " + i + " = " + dist[i]);
                }
            }
        }

        sc.close();
    }
}






//input values for testing:
// Enter number of vertices: 5
// Enter number of edges: 8
// Enter each edge in the format: <source> <destination> <weight>
// Edge 1: 0 1 -1
// Edge 2: 0 2 4
// Edge 3: 1 2 3
// Edge 4: 1 3 2
// Edge 5: 1 4 2
// Edge 6: 3 2 5
// Edge 7: 3 1 1
// Edge 8: 4 3 -3
// Enter source vertex: 0