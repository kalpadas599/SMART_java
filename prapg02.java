//non linear graph using 

import java.util.*;

class prapg02 {

    public static void main(String[] args) {
        System.out.println("Enter no of vertices: ");
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        System.out.println("enter no of edges: ");
        int E = sc.nextInt();
        //int adj[][] = new int[V][V];

        //adj list init
        List<Integer>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            System.out.print("Edge "+(i + 1)+" : ");
                int s = sc.nextInt();
            int d = sc.nextInt();
            if (s < 0 || s >= V || d < 0 || d >= V) {
                System.out.println("invalid edge()" + s + "," + d);
                i--;
            } else {
                adj[s].add(d);//for directed graph
            }
        }

        System.out.println("Adjacency List is:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
