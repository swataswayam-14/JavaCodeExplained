package abstraction;

public abstract class Parent {
    //objects of abstract classes cannot be created
    //abstract static methods cannot be created as static method cannot be overriden
    final int VALUE;
    String name;
    static void hello(){
        System.out.println("Hey!! ");
    }
    public Parent(String name){
        this.name = name;
        VALUE = 87236;
    }
    //abstract constructor are not allowed
    public abstract void career(String name);
    public abstract void partner(String name , int age);

    public void greeting(){
        System.out.println("This is a normal method");
    }

    //we cannot have a final abstract classes as it needs to be inherited
}
