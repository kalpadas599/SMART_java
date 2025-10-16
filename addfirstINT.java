class addfirstINT{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void addfirst(int newdata){
        Node newnode=new Node(newdata);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int newdata){
        Node newnode = new Node(newdata);
        if(head==null){
            head=newnode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }
    public void printlist(){
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+" ");
            currnode=currnode.next;
        }
    }
    public static void main(String args[]){
        addfirstINT list=new addfirstINT();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.printlist();
        System.out.println();
        list.addlast(4);
        list.printlist();

    }
}