package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL l = new LL();

        l.insertFirst(12);
        l.insertFirst(23);
        l.insertLast(21);
        l.insertLast(323);
        l.insertLast(21);
        l.insertLast(323);
        l.insertLast(45);
        try {
            l.insert(1231321, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        l.display();

        // System.out.println(l.deleteFirst());
        // l.display();
        // System.out.println(l.deleteLast());
        // l.display();
        // System.out.println(l.deleteLast2());
        // l.display();
        try {
            System.out.println(l.delete(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        l.display();
        System.out.println();
        System.out.println(l.getSize());

    }
}
