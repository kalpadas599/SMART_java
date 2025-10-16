import java.util.*;
class tree02{
     static class Node{
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }    
    }
    Node root;
    public Node buildTree(Scanner sc){
        System.out.print("enter node value:[-1 for null] ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        Node newNode = new Node(data);
        System.out.print("enter left child of:"+data+" : ");
        newNode.left = buildTree(sc);
        System.out.print("enter right child of:"+data+" : ");
        newNode.right = buildTree(sc);
        return newNode;
    }
    public void inorder(Node n1){
        if(n1 == null){
            return ;
        }
        inorder(n1.left);
        System.out.println("show inorder: "+n1.data);
        inorder(n1.right);
    }
    public void preorder(Node n1){
        if(n1 == null){
            return ;
        }
        System.out.println("show preorder: "+n1.data);
        preorder(n1.left);
        preorder(n1.right);
    }
    public void postorder(Node n1){
        if(n1 == null){
            return ;
        }
        postorder(n1.left);
        postorder(n1.right);
        System.out.println("show postorder: "+n1.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tree02 t = new tree02();/* 
        using static[static class Node] keyword without creating object directly calling function/methods
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5); */
        /* witout static class Node keyword creating object of Node class
        t.root = t.new Node(1);
        t.root.left = t.new Node(2);
        t.root.right = t.new Node(3);
        t.root.left.left = t.new Node(4);
        t.root.left.right = t.new Node(5);*/
        System.out.println("Build tree by entering values");
        t.root = t.buildTree(sc);
        System.out.println("\nINORDER:");
        t.inorder(t.root);
        System.out.println("\nPREORDER:");
        t.preorder(t.root);
        System.out.println("\nPOSTORDER:");
        t.postorder(t.root);
        sc.close();
    }
}
/*take user input as:
2 4 -1 -1 5 -1 -1 3  -1 -1
*/