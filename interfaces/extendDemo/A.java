package interfaces.extendDemo;

public interface A {
    //static interface should have a body
    static void helloA(){
        System.out.println("Hello from A");
    }
    void fun();
    default void functionA(){
        System.out.println("I am in A interface");
    }
}
