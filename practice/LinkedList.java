//package practice;
//
//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val=val;
//
//    }
//
//}
//
//public class LinkedList {
//    static Node head=null;
//    static void add(int val ){
//        Node temp=new Node(val);
//        if(head==null){
//            head=temp;
//            return;
//        }
//        temp.next=head;
//        head=temp;
//    }
//
//    static void reverse(){
//        Node temp=head;
//        Node prev=null;
//        while(head!=null){
//            temp=head.next;
//            head.next=prev;
//            prev=head;
//            head=temp;
//        }
//        head=prev;
//
//    }
//    public static void print() {
//        Node run = head;
//        while (run != null) {
//            System.out.print(run.val + " ");
//            run = run.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        add(4);
//        add(3);
//        add(2);
//        add(1);
//        print();
//        reverse();
//        print();
//
//    }
//}
