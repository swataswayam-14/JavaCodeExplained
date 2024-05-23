package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class Main {
    //enum can implement multiple interfaces but it cannot extend classes
    enum Week implements A{
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;

        //these are enum constants
        //it is by default public , static and final
        //since its final hence we cannot create child enums
        //type is Week

        //abstract methods are not allowed inside an enum , a method body is required
        Week(){
            System.out.println("constructor called for "+this);
        }//this is not public or protected, only private or default
        //this is because we donot want to create new objects
        //this is not enum concept
        @Override
        public void hello(){
            System.out.println("Hello from enum");
        }

    }
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(23);
        System.out.println(lst);

        List<Integer> lst2 = new LinkedList<>();

        lst2.add(123);
        lst2.add(12);
        lst2.add(45);
        System.out.println(lst2);

        List<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(324);

        System.out.println(vector);

        Week week = Week.Monday;
        System.out.println(week);

        for(Week day: Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());
        week.hello();

        System.out.println(Week.valueOf("Wednesday"));
    }
}
