package CollectionClasses;

import java.util.LinkedList;

public class LinkedListImplement {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        System.out.println(list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(3,5);
        System.out.println(list);
        list.offer(9);
        System.out.println(list);
        list.addFirst(0);
        System.out.println(list);
        list.addLast(4);
        System.out.println(list);
        System.out.println(list.contains(6));
        System.out.println(list.peek());
        list.poll();
        System.out.println(list);

        System.out.println(list.pop());
        list.push(88);
        list.push(99);
        System.out.println(list);

        list.remove();
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.poll();
        System.out.println(list);
    }
}
