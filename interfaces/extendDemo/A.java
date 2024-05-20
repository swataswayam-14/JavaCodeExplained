package interfaces.extendDemo;

public interface A {
    void fun();
    default void functionA(){
        System.out.println("I am in A interface");
    }
}
