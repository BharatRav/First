//package Guest;
//
//class Node{
//    int val;
//    Node next;
//    Node (int val){
//        this.val=val;
//        next=null;
//    }
//}
//
//public class QueueLL {
//     Node head=null;
//
//    public QueueLL(Node head) {
//        this.head = head;
//    }
//    public void add(int val) {
//        Node temp=new Node(val);
//        if (head==null){
//            head=temp;
//        }else{
//            Node run=head;
//            while (run.next!=null) {
//                run=run.next;
//            }
//            run.next=temp;
//        }
//    }
//     void printLL(){
//        Node run=head;
//        while(run!=null){
//            System.out.print(run.val+" ");
//            run=run.next;
//        }
//
//        System.out.println();
//    }
//     void remove(){
//        if (head==null){
//            System.out.println("Queue is empty");
//        }else {
//            head = head.next;
//        }
//    }
////    public static void main(String[] args) {
////        for(int i=1;i<10;i++) {
////            add(i);
////        }
////        printLL();
////        remove();
////        remove();
////        remove();
////        printLL();
////    }
//}
