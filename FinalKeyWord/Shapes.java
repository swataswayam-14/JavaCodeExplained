package FinalKeyWord;

public class Shapes {
    final void area(){
        System.out.println("The area of the shape depends on its type");
    }
}

//the method decalred as final cannot be overriden
//when a final method is called , then the java compiler can copy the byte code directly with the compiled code of the calling method, hence eliminating the overhead


