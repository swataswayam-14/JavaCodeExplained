package interfaces.extendDemo;

public class Main implements B {

    @Override
    public void fun(){
        System.out.println("Netflix and chill");
    }
    @Override
    public void greet(){    
        System.out.println("Good morning");
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.greet();
        m.fun();
        m.functionA();
        m.functionB();

        A.helloA();
        B.hello();
    }
}


// the access modifier for the overriden method should be same as the parent class or better than it
//example if the parent class has a method which is protected, then if the method is overriden by the child class then the access modifier of the method in the child class should be better than protected , that is it can be protected or public, it cannot be private