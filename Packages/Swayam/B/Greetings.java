package Packages.Swayam.B;
import static Packages.Swayam.A.Greetings.message;
public class Greetings {
    public static void main(String[] args) {
        System.out.println("Hello from B");
        message();
        System.out.println(Human.population);
        Human Swayam = new Human("Bilu", 12, 32.5f);
        Human Lasun = new Human("Bilu", 12, 32.5f);
        System.out.println(Swayam.age);
        System.out.println(Human.population);
        //when a member is declared as static , it can be accessed before any members of the class is created and without referencing to that object

        //static is independent of object, doesnot belong to an instance
        //non static is dependent in object and instances

        //greeting();  we can't use this as it requires an instance but the function from which we are calling this function doesnot depend on instances


        Greetings obj = new Greetings();
        obj.greeting(); // this works (as we have created an instance of the class (Greetings) and then calling the function)

        //hence we cannot access non static stuff without referencing their instances in a static context
    } 
    static void fun(){
        System.out.println("This is a static function");
    }

    void greeting(){
        fun(); //this is allowed
        System.out.println("Hello ");
    }
}
