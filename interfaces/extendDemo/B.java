package interfaces.extendDemo;

public interface B extends A{


    //static methods in interfaces need to have a body as they cannot be overriden by the class which implements the interface
    static void hello(){
        System.out.println("Hello from B");
    }

    void greet();
    default void functionB(){
        System.out.println("I am in B interface");
    }
}
