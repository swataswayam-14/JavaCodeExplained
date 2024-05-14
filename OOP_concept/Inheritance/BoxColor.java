package OOP_concept.Inheritance;

public class BoxColor extends BoxWeightChild {
    String color;
    public BoxColor(){
        super();
        this.color = "not assigned";
    }
    public BoxColor(double weight, String color){
        super(weight);
        this.color = color;
    }
    public BoxColor(double side , double weight, String color){
        super(side, weight);
        this.color = color;
    }
    public BoxColor(double l , double w, double h, double weight, String color){
        super(l, w, h, weight);
        this.color = color;
    }
}
