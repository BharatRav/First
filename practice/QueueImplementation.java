package practice;

import java.util.Scanner;

class queue{
    int l;
    int r;
    int size;
    int[] arr;
    queue(int size){
        this.size=size;
        int[] arr=new int[size];
        l=-1;
        r=-1;
    }
    public void offer(int num){
        if(l==-1)
            l++;
        //if queue is full
        if(r==size-1){
            System.out.println("Queue is full");
            return;
        }
        r++;
        arr[r]=num;
    }
    public void poll(){
        if(l==size-1){
            System.out.println("Queue is Emtpy");
            return ;
        }
        l++;
    }
    public void peek(){
        if(l==-1 && r==-1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[l]+" ");
    }
}
public class QueueImplementation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        queue q=new queue(size);
    }
}
