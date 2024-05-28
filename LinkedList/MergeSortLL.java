package LinkedList;

public class MergeSortLL {
    private int size = 0;
    private ListNode head;

    MergeSortLL() {
        this.size = 0;
    }

    public MergeSortLL sortList() {
        if (head == null || head.next == null) {
            return this;
        }
        ListNode mid = getMid(head);
        MergeSortLL left = new MergeSortLL();
        left.head = head;
        left = left.sortList();
        MergeSortLL right = new MergeSortLL();
        right.head = mid.next;
        mid.next = null; // Break the list into two parts
        right = right.sortList();

        return merge(left, right);
    }

    private ListNode getNode(int index) {
        if (index == 0) {
            return head;
        }
        if (index < 0) {
            return null;
        }
        ListNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private static ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public MergeSortLL merge(MergeSortLL ll1, MergeSortLL ll2) {
        MergeSortLL mergeList = new MergeSortLL();
        ListNode temp1 = ll1.head;
        ListNode temp2 = ll2.head;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                mergeList.insertLast(temp1.val);
                temp1 = temp1.next;
            } else if (temp1.val == temp2.val) {
                mergeList.insertLast(temp1.val);
                mergeList.insertLast(temp2.val);
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                mergeList.insertLast(temp2.val);
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            mergeList.insertLast(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            mergeList.insertLast(temp2.val);
            temp2 = temp2.next;
        }
        return mergeList;
    }

    public void insertLast(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            size++;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}