package dsa2.LinkedList;



public class LinkedList {
    Node head=null;
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    private  void addData(int data){
        Node temp= new Node(data);
        if(head==null){
            head=temp;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }
    private void  printLinkedList(){
        if(head==null){
            System.out.println("LinkedList is Empty!");
            return;
        }
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    private void removeFirst(){
        if(head==null){
            System.out.println("Cannot remove! LinkedList Empty!");
            return;
        }
        head=head.next;
    }
    private void removeeLast(){
        if(head==null){
            System.out.println("Cannot remove! LinkedList Empty!");
            return;
        }
        Node prev=null;
        Node curr=head;
        while (curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addData(5);
        list.addData(4);
        list.addData(3);
        list.addData(2);
        list.addData(1);
        list.printLinkedList();
        list.removeFirst();
        list.printLinkedList();
        list.removeeLast();
        list.printLinkedList();

    }
}

