package OOP_concept.Inheritance;

public class InheritanceExample {
    double length;
    double height;
    double width;
    String name;
    InheritanceExample(){
        this.length = 12;
        this.width = 12;
        this.height = 12;
        this.name = "Initial shape";
    }
    //anything decared private in the parent class cannot be inherited by child class

    InheritanceExample(double side){
        this.height = side;
        this.width = side;
        this.length = side;
        this.name = "Cube";
    }

    InheritanceExample(double l, double w, double h){
        this.height = h;
        this.width = w;
        this.length = l;
        this.name = "Cuboid";
    }

    InheritanceExample(InheritanceExample old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
        this.name = old.name;
    }

    public void information(){
        System.out.println("Running the "+this.name);
    }
}
