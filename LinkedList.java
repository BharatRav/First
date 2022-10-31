import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }


    //fuctions
    static Node head= null;
    public  static void addAtLast(int val) {
        Node temp = new Node(val);
        if (head == null) {
            temp.next = head;
            head = temp;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    // fuction for searching
    public  static void searchpos( int value) {
        if ( head == null) {
            System.out.println("value  not exist.");
        } else {
            int count = 1;
            Node curr = head;
            while (curr.val != value && curr != null) {
                count++;
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("value not exist.");
            } else {
                System.out.println("value exist at position:" + (count+1));
            }
        }
    }

}
public class LinkedList {
    /*
    1->2->3->4->5
         target=3(val)
     */


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Node obj= new Node(1);
        obj.addAtLast(2);
        obj.addAtLast(3);
        obj.addAtLast(4);
        obj.addAtLast(5);
        obj.searchpos(3);

    }

}
