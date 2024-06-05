package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    //inbuilt examples
    public static void main(String[] args) throws StackException {
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

        System.out.println("===========Custom stack implementation=================");
        CustomStack stack2 = new CustomStack();
        stack2.push(32);
        stack2.push(36);
        stack2.push(37);
        stack2.push(38);

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

        System.out.println("===============Dynamic stack implementation===================");
        DynamicStack stack3 = new DynamicStack();
        stack3.push(17);
        stack3.push(16);
        stack3.push(15);
        stack3.push(12);
        stack3.push(123);
        stack3.push(16);
        stack3.push(17);
        stack3.push(17);
        stack3.push(12);
        stack3.push(17);
        stack3.push(19);
        stack3.push(12);
        stack3.push(13);
        stack3.push(18);
        stack3.push(123);
        stack3.push(1743);

        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());

        System.out.println("===================Custom queue implementation===============");
        CustomQueue queue2 = new CustomQueue();
        queue2.insert(1);
        queue2.insert(2);
        queue2.insert(3);
        queue2.insert(4);
        queue2.insert(5);

        queue2.display();
        try {
            System.out.println(queue2.remove());
            System.out.println(queue2.remove());
            System.out.println(queue2.remove());
            System.out.println(queue2.remove());
            System.out.println(queue2.remove());   
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("===================Circular queue implementation===============");

        CircularQueue queue3 = new CircularQueue();
        queue3.insert(12);
        queue3.insert(13);
        queue3.insert(14);
        queue3.insert(15);
        queue3.insert(16);

        queue3.display();
        try {
            System.out.println(queue3.remove());
        } catch (Exception e) {
            System.out.println(e);
        }
        queue3.insert(121121);
        queue3.display();

        System.out.println("==============Queue using stacks================(Google interview)");

        QueueUsingStacks queueStack = new QueueUsingStacks();
        queueStack.insert(1);
        queueStack.insert(2);
        queueStack.insert(3);
        queueStack.insert(4);
        queueStack.insert(5);

        try {
            int firstItem = queueStack.peek();
            System.out.println("The first item is "+firstItem);

            System.out.println("======Removing all the elements from the queue=====");

            System.out.println(queueStack.remove());
            System.out.println(queueStack.remove());
            System.out.println(queueStack.remove());
            System.out.println(queueStack.remove());
            System.out.println(queueStack.remove());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
