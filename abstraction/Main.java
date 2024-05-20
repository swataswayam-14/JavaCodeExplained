package abstraction;

public class Main {
    public static void main(String[] args) {
        Son s = new Son("Son ");

        s.career("best software developer and a CEO");
        s.partner("dono", 20);

        Daughter d = new Daughter("Daughter");
        d.career("doctor");
        d.partner("null", 0);

        //Parent p = new Parent("parent") : objects of abstract classes cannot be created


        Parent.hello();
        s.greeting();
        d.greeting();

        Parent daughter = new Daughter("null"); //we can use the Parent class as a reference variable
        //run time polymorphism
        daughter.career("null");
    }
}
