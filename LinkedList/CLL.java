package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;

        if(head!=null){
            do{
                System.out.print(temp.val+"->");
                temp = temp.next;
            }while(temp!=head);
            System.out.println(head.val);
        }else{
            System.out.println("The Circular linkedList is empty");
        }
    }

    public int deleteLast() throws Exception{
        if(head == null){
            throw new Exception("Linked list is empty");
        }
        if(size == 1){
            int val = head.val;
            head = null;
            size--;
            return val;
        }
        Node temp = head;
        do{
            temp = temp.next;
        }while(temp.next.next!=head);
        int val = tail.val;
        temp.next = head;
        tail = temp;
        size--;
        return val;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        do {
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                size--;
                break;
            }
            node = node.next;
        } while (node != head);
    }


    private class Node{
        int val;
        Node next;

        private Node(int val){
            this.val = val;
        }
    }
}
