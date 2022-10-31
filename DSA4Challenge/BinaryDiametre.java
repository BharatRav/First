package DSA4Challenge;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryDiametre {
    Node root;
    // linew 11 added by me
    static class Node {
        int data;
        Node left;
        Node right;
        Node parent;

        Node(int data,Node parent) {
            this.data = data;
            this.parent =parent;
        }
    }

        private  Node insertData( Scanner sc) {


        while(sc.hasNext()) {


            if (root == null) {
                int data = sc.nextInt();
                if(data!=-1) {
                    root = new Node(data,null);
                } else {
                    continue;
                }
            }
            Queue<Node> qu = new LinkedList<>();
            qu.add(root);
            while (!qu.isEmpty() && sc.hasNext()) {
                int data =sc.nextInt();
                if(data==-1){
                    continue;
                }
                Node temp = qu.poll();
                if (temp.left == null) {
                    temp.left = new Node(data,temp);
                }
                if (temp.right == null) {
                    temp.right = new Node(data,temp);

                }
            }
        }
            return root;

        }

        private  Node findNode(int SourceData) {
        if(root ==  null) {
            return null;
        }
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            Node temp = qu.poll();
            if(temp.data==SourceData) {
                return temp;
            }
            if(temp.left!=null) {
                qu.add(temp.left);
            }
            if(temp.right!=null) {
                qu.add(temp.right);
            }
        }
        return null;
        }

        private int MaxDistanceFind(Node source,int destinationData) {
        int Maxdistance=0;
        if(root!=null) {
            Queue<Node> qu = new LinkedList<>();
            qu.add(root);
            while (!qu.isEmpty()) {
                Node temp = qu.poll();
                if(temp.data==destinationData) {
                    return temp;
                }
                if(temp.left!=null) {
                    qu.add(temp.left);
                }
                if(temp.right!=null) {
                    qu.add(temp.right);
                }
            }
        }
        return Maxdistance;
        }

        public static void main(String[] args) {
            BinaryDiametre tree1 = new BinaryDiametre();
            Scanner sc = new Scanner(System.in);

             tree1.root = tree1.insertData(sc);
             //source data;
            Node source=tree1.findNode(8);

            //destination data longest path
            int result = tree1.MaxDistanceFind(source,7);
            System.out.println("Max Distance between source and destination: "+result);

        }
}

