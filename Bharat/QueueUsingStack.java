package Bharat;

import java.util.Stack;

public class QueueUsingStack {

    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        offer(5, st1);
        offer(6,st1);
        offer(7,st1);
        offer(8,st1);
        offer(9,st1);
        poll(st1);
        printq(st1);

    }

    public static void offer(int val, Stack<Integer> st1) {  //adding in queue using stack
        st1.push(val);
        System.out.println(st1);
    }
    public static void poll(Stack<Integer> st1){
        Stack<Integer> st2 = new Stack<>();
        if(st1.isEmpty()){
            System.out.println("Queue is Empty!");
        }else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st2.pop();
            //when poped then return back all element in stack 1
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
    }
    public static void printq(Stack<Integer> st1){
        Stack<Integer> st2 = new Stack<>();
        if(st1.isEmpty()){
            System.out.println("Queue is Empty!...Nothing to print");
        }else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            //when poped then return back all element in stack 1 and print all numbers
            while(!st2.isEmpty()){
                int val=st2.pop();
                System.out.print(val+" ");
                st1.push(val);
            }
            System.out.println();
        }
    }
}
