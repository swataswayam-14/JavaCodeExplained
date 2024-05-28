package LinkedList;

import static LinkedList.LL.createCycle;
import static LinkedList.LL.detectCycle;
import static LinkedList.LL.findLengthOfCycle;
import static LinkedList.LL.findStartingIndexOfCycle;
import static LinkedList.LL.merge;
import static LinkedList.LL.middleOfLinkedList;

public class Main {
    public static void main(String[] args) {
        // // LL l = new LL();
        // // l.RecInsert(131, 0);
        // // l.RecInsert(14312, 1);
        // // l.display();

        // // l.insertFirst(12);
        // // l.insertFirst(23);
        // // l.insertLast(21);
        // // l.insertLast(323);
        // // l.insertLast(21);
        // // l.insertLast(323);
        // // l.insertLast(45);
        // // try {
        // //     l.insert(1231321, 3);
        // // } catch (Exception e) {
        // //     System.out.println(e.getMessage());
        // // }
        
        // // l.display();

        // // // System.out.println(l.deleteFirst());
        // // // l.display();
        // // // System.out.println(l.deleteLast());
        // // // l.display();
        // // // System.out.println(l.deleteLast2());
        // // // l.display();
        // // try {
        // //     System.out.println(l.delete(3));
        // // } catch (Exception e) {
        // //     System.out.println(e.getMessage());
        // // }
        // // l.display();
        // // System.out.println();
        // // System.out.println(l.getSize());


        // // DLL l = new DLL();

        // // // l.insertFirst(1);
        // // // l.insertFirst(2);
        // // // l.insertFirst(3);
        // // // l.insertFirst(4);

        // // // // l.display();
        // // // // l.displayRev();

        // // // l.insertLast(12312321);
        // // // l.insertLast(0);

        // // // l.display();
        // // // l.displayRev();

        // //   l.insertLast(2);
        // // //  l.insertLast(3);
        // // //  l.insertLast(4);
        // // try {
        // //     // l.insert(1212, 1);
        // //     // l.insertAfter(1000, 4);
        // //     //System.out.println(l.deleteFirst());
        // //     System.out.println(l.deleteLast());
        // // } catch (Exception e) {
        // //     System.out.println(e.getMessage());
        // // }
        

        // // l.display();

        // // CLL cl = new CLL();
        // // cl.insert(1);
        // // cl.insert(2);
        // // cl.insert(3);
        // // cl.insert(5);
        // // cl.display();
        // // try {
        // //     System.out.println(cl.deleteLast());
        // //     cl.delete(1);
        // //     cl.display();
        // // } catch (Exception e) {
        // //     System.out.println(e.getMessage());
        // // }

        // // LL ll = new LL();
        // // ll.insertLast(12);
        // // ll.insertLast(13);
        // // ll.insertLast(13);
        // // ll.insertLast(15);
        // // ll.insertLast(15);
        // // ll.insertLast(45);
        // // System.out.println("first linked list");
        // // ll.display();
        // // System.out.println();

        // // LL ll2 = new LL();
        // // ll2.insertLast(6);
        // // ll2.insertLast(12);
        // // ll2.insertLast(13213);
        // // ll2.insertLast(151231);
        // // ll2.insertLast(1513232);
        // // ll2.insertLast(45231321);
        // // System.out.println("second linked list");
        // // ll2.display();
        // // System.out.println();


        // // System.out.println("Merged linked list");
        // // LL newList = new LL();
        // // newList = merge(ll2, ll);
        // // newList.display();
        // // // //ll.RemoveDuplicates();
        // // // ll.RemoveDuplicates2();
        // // // ll.display();

        // LL cycle = new LL();
        // // cycle.insertLast(12);
        // // cycle.insertLast(13);
        // // cycle.insertLast(14);
        // // cycle.insertLast(15);
        // // cycle.insertLast(12);
        // // cycle.insertLast(13);
        // // cycle.insertLast(14);
        // // cycle.insertLast(15);

        // System.out.println(middleOfLinkedList(cycle));

        // //createCycle(cycle);
        // // System.out.println(detectCycle(cycle));
        // // System.out.println(findLengthOfCycle(cycle));
        // // System.out.println(findStartingIndexOfCycle(cycle));

        MergeSortLL ll = new MergeSortLL();
        ll.insertLast(14);
        ll.insertLast(23);
        ll.insertLast(54);
        ll.insertLast(156);
        ll.insertLast(12);
        ll.insertLast(13);
        ll.insertLast(2324);

        MergeSortLL ll2 = new MergeSortLL();
        ll2.insertLast(1);
        ll2.insertLast(13);
        ll2.insertLast(14);
        ll2.insertLast(22);
        ll2.insertLast(55);
        ll2.insertLast(1561);
        ll2.insertLast(2324);



        MergeSortLL sortedList = new MergeSortLL();
        ll.display();
        sortedList = ll.sortList();
        sortedList.display();
        

        

      
    }
}
