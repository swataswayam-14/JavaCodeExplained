package abstraction;

public class Daughter extends Parent {

    public Daughter(String name){
        super(name);
    }


    @Override
    public void career(String name){
        System.out.println("I want to be "+name+" I am a girl");
    }

    @Override
    public void partner(String name , int age){
        System.out.println("I love "+name +" she is of age "+age+" she/her");
    }
}

