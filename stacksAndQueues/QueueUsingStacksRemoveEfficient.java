package stacksAndQueues;

import java.util.Stack;

public class QueueUsingStacksRemoveEfficient{

    Stack<Integer> first;
    Stack<Integer> second;

    QueueUsingStacksRemoveEfficient(){
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void insert(int item){
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }
    public int remove(){
        return first.pop();
    }
    public int peek(){
        return first.peek();
    }

}