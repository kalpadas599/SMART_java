//non linear graph using 

import java.util.*;
class graph01{
    public static void main(String[] args) {
        System.out.println("Enter no of vertices: ");
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        System.out.println("enter no of edges: ");
        int E = sc.nextInt();
        int adj[][] = new int[V][V];
        for(int i=0; i<E; i++){
            System.out.println("enter edges- [edge1: 0 1]");
            int s = sc.nextInt();
            int d = sc.nextInt();
            if(s<0 || s>=V || d<0 || d>=V){
                System.out.println("invalid edge()"+s+","+d);
                i--;
            }
            else{
                adj[s][d] = 1;//for directed graph
                //adj[d][s] = 1; //for undirected graph
                
            }
        }
        System.out.println("Adjacency matrix is:");
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}