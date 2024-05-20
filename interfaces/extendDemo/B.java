package interfaces.extendDemo;

public interface B extends A{
    void greet();
    default void functionB(){
        System.out.println("I am in B interface");
    }
}
