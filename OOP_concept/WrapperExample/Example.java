package OOP_concept.WrapperExample;

public class Example {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        Integer num = 20;
        Integer num2 = 10;

       System.out.println("------------Swapping primitives (pass by value)-------------");
       swap(a, b);
       System.out.println(a+" "+b);

       System.out.println("--------------Swapping Objects (pass by reference)-----------");
       swapObject(num, num2);
       System.out.println(num+" "+num2);

       System.out.println("____still didn't swap as Integer is 'final'____ ");
        
       //final is a keyword (we can prevent our content to be modified)
       //example: final int INCREASE = 2;   now this int cannot be modified

       final A myName = new A("Swayam");
       myName.name = "Billu";

       System.out.println(myName.name);

       //Error : A = new A("Billu");  when a non primitive is final then we cannnot re assign it but we can change the value of the object of which it is pointing



       //below for loop to test the garbage collector and the destruction of object and checking if the function (finalize) is called everytime an object is destroyed
        A object;
       for (int i = 0; i < 1000000000; i++) {
        object = new A("Billu");
       }


       
    }

    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }
    static void swapObject(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b=temp;
    }
}

class A{
    final String code = "hello";
    String name;

    public A(String name){
        System.out.println("Object is created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }//when any object of class A is destroyed then this method would be called
}



//println calls the toString() method for the object that is passed to it , if it didn't find a toString method then it will call a default function that is getClass().getName() + "@" + Integer.toHexString(hashcode())