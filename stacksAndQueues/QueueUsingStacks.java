package stacksAndQueues;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> first;
    Stack<Integer>second;

    QueueUsingStacks(){
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void insert(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int firstItem = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return firstItem;
        
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}
