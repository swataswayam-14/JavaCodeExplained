package LinkedList;

public class DLL {


    private Node head;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void displayRev(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.prev;
        }
        System.out.print("START");
        System.out.println();
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        if(head == null){
            head = node;
            size++;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }
    public void insert(int val , int index) throws Exception{

        Node node = new Node(val);
        if(index == 0){
            insertFirst(val);
            return;
        }else if(index == size){
            insertLast(val);
            return;
        }else if(index >size || index<0){
            throw new Exception("Invalid index , index greater than size of linkedlist");
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            if(temp!=null){
                temp = temp.next;
            }
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        size++;
        
    }

    public void insertAfter(int val , int afterVal) throws Exception{
        Node node = new Node(val);
        Node temp = head;
        if(size == 0){
            throw new Exception("The Node doesnot exist with the value "+afterVal);
        }
        while(temp!=null){
            if(temp.val == afterVal){
                break;
            }
            temp = temp.next;
        }
        if(temp != null){
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
            if(node.next != null){
                node.next.prev = node;
            }
            size++;
        }else{
            throw new Exception("The Node doesnot exist with the value "+afterVal);
        }
        
    }

    public int deleteFirst() throws Exception{
        if(head == null){
            throw new Exception("Linked List is empty");
        }
        if(size == 1){
            int val = head.val;
            head = null;
            return val;
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }
    public int deleteLast() throws Exception{
        if(head == null){
            throw new Exception("Linked List is empty");
        }
        if(size == 1){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = null;
        size--;
        return val;
    }


    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
