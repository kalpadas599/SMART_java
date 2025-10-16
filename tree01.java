//class for binary tree and inorder traversal

class tree01{
     //* The class Node defines a node structure with a String data field and left and right child nodes.
    class Node{
        String data;
        Node left,right;
    }
    Node root;
    Node newNode(String data){
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println(""+node.data);
        inorder(node.right);
    }
    public static void main(String[] args) {
        tree01 tree = new tree01();
        tree.root = tree.newNode("A");
        tree.root.left = tree.newNode("B");
        tree.root.right = tree.newNode("C");
        tree.root.left.left = tree.newNode("D");
        tree.root.left.right = tree.newNode("E");
        tree.inorder(tree.root);
    }
}