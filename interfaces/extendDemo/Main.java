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
    }
}
