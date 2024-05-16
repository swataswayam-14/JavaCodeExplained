package polymorphism;

public class Circle extends Shape {
    @Override //this is called annotation
    //use this to check if an method is overriden
    
    void area(){ //this method will be called when an object of Circle class is created , hence it overrides the parent "area" method
        System.out.println("The area is pie* radius square");
    }
}
