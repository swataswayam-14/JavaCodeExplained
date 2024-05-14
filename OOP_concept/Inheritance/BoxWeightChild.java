package OOP_concept.Inheritance;

public class BoxWeightChild extends InheritanceExample{
    double weight;
    public BoxWeightChild(){
        this.weight = -1;
    }
    public BoxWeightChild(double l, double w, double h, double weight){
        super(l,w,h); //used to initialize values present in parent class
        System.out.println(this.width);
        System.out.println(super.width);
        this.weight = weight;
    }
    public BoxWeightChild(double side , double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeightChild(BoxWeightChild other){
        super(other);
        this.weight = other.weight;
    }
}
