import java.util.*;

public class Dijkstra {
    static class Edge {
        int to, weight;
        Edge(int t0, int weight) {
            this.to = t0;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();

        // Input number of edges
        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();

        // Initialize graph
        List<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Input edges
        System.out.println("Enter each edge in the format: <source> <destination> <weight>");
        for (int i = 0; i < E; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            if (u < 0 || u >= V || v < 0 || v >= V || w < 0) {
                System.out.println("❌ Invalid edge. Vertex index must be between 0 and " + (V - 1) + ", and weight must be non-negative.");
                i--; // retry this edge
            } else {
                graph[u].add(new Edge(v, w)); // directed edge
            }
        }

        // Input source vertex
        System.out.print("Enter the source vertex for Dijkstra's algorithm: ");
        int src = sc.nextInt();

        if (src < 0 || src >= V) {
            System.out.println("❌ Invalid source vertex. Must be between 0 and " + (V - 1));
            sc.close();
            return;
        }

        // Dijkstra's algorithm
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0], d = cur[1];
            if (d > dist[u]) continue;

            for (Edge e : graph[u]) {
                if (dist[u] + e.weight < dist[e.to]) {
                    dist[e.to] = dist[u] + e.weight;
                    pq.add(new int[]{e.to, dist[e.to]});
                }
            }
        }

        // Output shortest distances
        System.out.println("\n✅ Shortest distances from source vertex " + src + ":");
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("Distance to vertex " + i + " = ∞ (unreachable)");
            } else {
                System.out.println("Distance to vertex " + i + " = " + dist[i]);
            }
        }

        sc.close();
    }
}