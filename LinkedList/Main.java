package LinkedList;

public class Main {
    public static void main(String[] args) {
        // LL l = new LL();
        // l.RecInsert(131, 0);
        // l.RecInsert(14312, 1);
        // l.display();

        // l.insertFirst(12);
        // l.insertFirst(23);
        // l.insertLast(21);
        // l.insertLast(323);
        // l.insertLast(21);
        // l.insertLast(323);
        // l.insertLast(45);
        // try {
        //     l.insert(1231321, 3);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        
        // l.display();

        // // System.out.println(l.deleteFirst());
        // // l.display();
        // // System.out.println(l.deleteLast());
        // // l.display();
        // // System.out.println(l.deleteLast2());
        // // l.display();
        // try {
        //     System.out.println(l.delete(3));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // l.display();
        // System.out.println();
        // System.out.println(l.getSize());


        // DLL l = new DLL();

        // // l.insertFirst(1);
        // // l.insertFirst(2);
        // // l.insertFirst(3);
        // // l.insertFirst(4);

        // // // l.display();
        // // // l.displayRev();

        // // l.insertLast(12312321);
        // // l.insertLast(0);

        // // l.display();
        // // l.displayRev();

        //   l.insertLast(2);
        // //  l.insertLast(3);
        // //  l.insertLast(4);
        // try {
        //     // l.insert(1212, 1);
        //     // l.insertAfter(1000, 4);
        //     //System.out.println(l.deleteFirst());
        //     System.out.println(l.deleteLast());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        

        // l.display();

        // CLL cl = new CLL();
        // cl.insert(1);
        // cl.insert(2);
        // cl.insert(3);
        // cl.insert(5);
        // cl.display();
        // try {
        //     System.out.println(cl.deleteLast());
        //     cl.delete(1);
        //     cl.display();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        LL ll = new LL();
        ll.insertLast(12);
        ll.insertLast(13);
        ll.insertLast(13);
        ll.insertLast(15);
        ll.insertLast(15);
        ll.insertLast(45);
        ll.display();
        System.out.println();
        //ll.RemoveDuplicates();
        ll.RemoveDuplicates2();
        ll.display();
        

      
    }
}
