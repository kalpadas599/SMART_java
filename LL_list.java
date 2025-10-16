
//package smart;
import java.util.Scanner;
class LL_list {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(String newdata){
        Node newnode=new Node(newdata);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String newdata)
    {
        Node newnode=new Node(newdata);
        if(head==null)
        {
            head=new Node(newdata);
            return;
        }
        newnode.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=newnode;
        //return;
    }
    public void printlist()
    {
        Node currentnode=head;
        while(currentnode!=null)
        {
            System.out.print(currentnode.data+" ");
            currentnode=currentnode.next;
        }
    }
    public static void main(String[] args) {
        LL_list list = new LL_list();
        //user input throough loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data for node " + (i + 1) + ":");
            String data = sc.nextLine();
            list.addfirst(data);
            //list.addlast(data);

        }
        System.out.println("The data in the linked list is:");
        for(int i=0;i<n;i++){
            System.out.println("Node " + (i + 1) + ":");
            list.printlist();
        }
       /* Node head = list.new Node("Kalpa");
        Node first = list.new Node("Das");
        Node second = list.new Node("Da");
        head.next = first;
        first.next = second;
        
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("nalla");*/  
    }
}
