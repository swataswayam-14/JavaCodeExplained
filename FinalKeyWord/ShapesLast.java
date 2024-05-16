package FinalKeyWord;


//final keyword is also used to prevent inheritance

public final class ShapesLast{
    int num;
    ShapesLast(int num){
        this.num = num;
    }
    void display(){
        System.out.println("the number is "+this.num);
    }
}


//ShapesLast class cannot be inherited by other classes
//when we declare a class as final then implicitly it declares all its methods as final too.