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
        newObj.area();
    }
    
}
