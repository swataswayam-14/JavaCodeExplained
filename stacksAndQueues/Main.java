package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    //inbuilt examples
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //Stack is a class
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("===================================================================");

        Queue<Integer> queue = new LinkedList<>(); //Queue is an interface hence it does not have the implementation of the functions , hence it can be implemented by LinkedList

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int el = queue.peek();
        System.out.println(el);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


        System.out.println("==============================================================");

        Deque<Integer> deque = new ArrayDeque<>(); //can insert and delete from both the ends
        deque.addFirst(1);
        deque.add(12);
        deque.addFirst(123);

    }
}
