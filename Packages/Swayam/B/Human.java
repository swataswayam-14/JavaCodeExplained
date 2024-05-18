package Packages.Swayam.B;

import AccessControl.A;

public class Human{
    String name;
    int age;
    float salary;
    static int population; //properties which are common to all the objects present in a class but is not dependent to any object, we declare it as static
    Human(String name , int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1; //to access the static variable we use the class name
    }
    A a = new A(123, "afa", 123);
    // String name = a.name;
    // int num = a.num

    //in different packages we cannot access the data members of the class
}    