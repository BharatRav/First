package Bharat;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node front;
    Node rear;
    Queue(){
        this.front=null;
        this.rear=null;
    }

    public void enqueue(int data){
        Node temp=new Node(data);
        if(rear==null){
            this.front=temp;
            this.rear=temp;
            return;
        }
        this.rear.next=temp;
        this.rear=temp;
    }
    public void dequeue(){
        if(front==null){
            System.out.println("Queue is Empty!");
            return;
        }
        //Node temp=this.front;
        this.front=this.front.next;
        if(this.front==null){
            this.rear=null;
        }
    }
    public void printQueue(){
        if(front==null) {
            System.out.println("Queue is Empty!");
            return;
        }
        Node curr=front;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
public class TestQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.printQueue();
        q.enqueue(5);
        q.printQueue();
        q.dequeue();
        q.printQueue();


    }
}
