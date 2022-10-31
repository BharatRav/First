package CollectionClasses;



import java.util.LinkedList;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st);
        st.push(3);
        System.out.println(st);
        st.push(4);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        st.add(1);
        System.out.println(st);
        st.add(1,5);
        System.out.println(st);


    }
}
