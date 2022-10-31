package Trees.BinaryTree;
/* only printing
    not storing levelwise
    by sagar sir aproach
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplement {
    Node rootNode=null;
    private static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    //first node of the tree
    private  void insertNode(int data){
        Node newNode= new Node(data);
        if(rootNode==null){
            rootNode=newNode;
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(rootNode);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            if(temp.left==null){
                temp.left=newNode;
                break;
            }else{
                queue.offer(temp.left);
            }

            if(temp.right==null){
                temp.right=newNode;
                break;
            }else{
                queue.offer(temp.right);
            }
        }
    }
    private  void printTree(){
        if(rootNode==null){
            System.out.println("Tree is Empty!");
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(rootNode);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }
    private  void levelOrderTraversal(){
        if(rootNode==null){
            System.out.println("Tree is Empty!");
            return;
        }

        Queue<Node> q= new LinkedList<>();
        q.offer(rootNode);
        q.offer(null);

        while (!q.isEmpty()){
            Node temp= q.poll();

            if(temp!=null){
                System.out.print(temp.data+" ");

                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if (temp.right!=null){
                    q.offer(temp.right);
                }
            }else{
                System.out.println();
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }
        }

    }

    public static void main(String[] args) {
        BinaryTreeImplement bt=new BinaryTreeImplement();

        for(int i=0;i<10;i++){
            int randomNumber= (int)(Math.random()*100);

            bt.insertNode(randomNumber);
            System.out.println("Inserting "+randomNumber+" in the tree....");
        }
        System.out.println();
        bt.levelOrderTraversal();
        System.out.println(".................");
        bt.printTree();

    }
}
