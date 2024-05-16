package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();


        Shape newObj = new Circle();

        shape.area();
        circle.area();
        square.area();

        System.out.println();
        newObj.area(); //this calls the area method of the Circle Object
        //the function the object can access depends on its reference but the method which the object will access depends on the class which is used to create the object.

        //here the type of "newObj" is of the parent class (i.e. Shape) but the object is of the subclass (i.e. Circle)

        //Parent obj = new Child()
        //here which method will be called depends on Child, this is known as upcasting, and this whole concept is known as Overriding.
    }
    
}
