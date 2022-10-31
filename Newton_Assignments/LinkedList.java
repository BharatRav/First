package Newton_Assignments;
/*
    write a program to reverse a linked list
 */
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LinkedList {
    static Node head=null;
    public static void add(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    public static void printList(){
        Node run=head;
        while(run!=null){
            System.out.print(run.val+" ");
            run=run.next;
        }
        System.out.println();
    }
    public static void reverse(){
        Node prev=null;
        Node temp=head;
        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        head=prev;
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        add(5);
        add(4);
        add(3);
        add(2);
        add(1);
        printList();
        reverse();
        printList();
    }
}
