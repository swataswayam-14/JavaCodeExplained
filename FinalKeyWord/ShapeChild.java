package FinalKeyWord;


public class ShapeChild extends Shapes {
    int weight;
    ShapeChild(int num , int weight){
        super(num);
        this.weight = weight;
    }
    public static void Greetings(){
        System.out.println("Greetings from ShapeChild class");
    }
    public static void main(String[] args) {
        Shapes shape = new ShapeChild(1, 10);
        Greetings(); //Greetings from ShapeChild class
        //all the static methods are being inherited, there is no point in Overriding them in the child class, because the method in the parent class will always run no matter from which object we call it

        shape.Greetings(); //Greetings from Shapes class
    }
}
