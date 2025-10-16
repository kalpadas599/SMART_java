
import java.util.Scanner;

class binaryTree{
    static int idx=-1;
    static class Node{
        int data;
        Node left, right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node buildTree(int nodes[]){
        idx++;
        if(idx>=nodes.length){
            return null;
        }
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }   
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nodes:[-1 for null] ");
        int n = sc.nextInt();
        int[] nodes = new int[n];
        System.out.println("enter nodes value[preorder]:");
        for(int i=0; i<n; i++){
            nodes[i]=sc.nextInt();
        }
        //int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        idx=-1;
        Node root = buildTree(nodes);
        //display tree
        /*System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.right.right.data); */
        System.out.println("you entered:");
        printTree(root);
        System.out.println();
    }
    public static void printTree(Node root){
        if(root==null){
            System.out.println("-1");
            return;
        }
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }
}