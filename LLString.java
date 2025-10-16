public class LLString
{
    Node head;
    static class Node
    {
        String data;
        Node next;
        Node(String d)
        {
            data=d;
            next=null;
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
        return;
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
    public static void main(String args[])
    {
        LLString llist=new LLString();
        llist.addfirst("nalla");
        llist.addfirst("good");
        llist.addfirst("very");
        llist.printlist();
        System.out.println();
        llist.addlast("kalpa");
        llist.addlast("das");
        llist.addlast("da");
        llist.addlast("alas");
        llist.printlist();
    }
}