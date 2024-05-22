package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human swayam = new Human("swayam", 20);
        Human twin = (Human)swayam.clone(); //clone will copy all the values from one object to another object
        System.out.println(twin.name);

        Human twinMoreOverhead = new Human(swayam); //in efficient : more program overhead because of new keyword
        System.out.println(twinMoreOverhead.age);
    }
}
