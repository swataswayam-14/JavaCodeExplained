package abstraction;

public class Son extends Parent {

    public Son(String name){
        super(name);
    }

    @Override
    public void career(String name){
        System.out.println("I want to be "+name);
    }

    @Override
    public void partner(String name , int age){
        System.out.println("I love "+name +" she is of age "+age);
    }

    @Override
    public void greeting(){
        System.out.println("Overriden greeting method in son");
    }
}
