package LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        this.size += 1;
    }

    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertLast(int val){
        //O(1) (if we maintain the tail)
        //O(n) (if we donot maintain the tail)
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        this.size+=1;
    }

    public void insert(int val , int index) throws Exception{
        if(index == 0){
            insertFirst(val);
            return;
        }else if(index == size){
            insertLast(val);
            return;
        }else if(index > size){
            throw new Exception("Cannot insert at position greater than the size of the linkedlist");
        }

        Node temp = head;

        for (int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        if(head == tail){
            int val = head.val;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(head == tail){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = null;
        return val;
    }

    public int deleteLast2(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete( int index) throws Exception{
        if(head == tail || index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
            
        }
        if(index > size || index<0){
            throw new Exception("not a valid index");
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;

    }

    private Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node; //returns reference pointer to that node
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public int getSize(){
        return this.size;
    }
//QUESTIONS
    //insertion using recursion
    public void RecInsert(int val , int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val , int index , Node node){
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }
//remove duplicates in a sorted linked list: 
    public void RemoveDuplicates(){
        if(size <= 1){
            return;
        }
        Node temp1 = head;
        Node temp2 = head;
        
        while(temp1!=null && temp2!=null){
            if(temp2.val == temp1.val){
                temp1 = temp1.next;
                size -= 1;
            }else{
                temp2.next = temp1;
                temp2 = temp1;
            }
        }
    }
    public void RemoveDuplicates2(){
        if(size <= 1){
            return;
        }
        Node node = head;

        while(node.next!=null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    //merge two sorted lists

    public static LL merge(LL first , LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }else if(s.val < f.val){
                ans.insertLast(s.val);
                s = s.next;
            }else{
                ans.insertLast(f.val);
                ans.insertLast(s.val);
                s = s.next;
                f = f.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.val);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

    public static boolean detectCycle(LL list){
        if(list.getSize() <= 1){
            return false;
        }
        Node fast = list.head;
        Node slow = list.head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;

    }
    public static int findLengthOfCycle(LL list){
        if(list.getSize() <= 1){
            return 0;
        }
        int len = 0;
        Node fast = list.head;
        Node slow = list.head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == null || fast.next == null){
                return 0;
            }
            if(fast == slow){
                break;
            }
        }
        do {
            len++;
            slow = slow.next;
        } while (slow!=fast);

        return len;
       

    }
    public static void createCycle(LL list){
        if(list.getSize() <= 1){
            return;
        }
        Node temp = list.head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = list.head.next.next;
    }

    public static int findStartingIndexOfCycle(LL list){
        if(list.getSize() <= 1){
            return -1;
        }
        int length = findLengthOfCycle(list);
        Node f = list.head;
        Node s = list.head;

        int index = 0;
        if(detectCycle(list)){
            while(length > 0){
                s = s.next;
                length--;
            }
    
            while(f!=s){
                index++;
                f = f.next;
                s = s.next;
            }
    
            return index;
        }
        return -1;

    }

    public static int middleOfLinkedList(LL list){
        if(list.head == null){
            return Integer.MIN_VALUE;
        }
        if(list.getSize() <= 1){
            return list.head.val;
        }
        Node fast = list.head;
        Node slow = list.head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }


    
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }

    }
}
