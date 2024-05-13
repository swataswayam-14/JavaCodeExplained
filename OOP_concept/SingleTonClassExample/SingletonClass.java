package OOP_concept.SingleTonClassExample;

public class SingletonClass {
    //singleton classes allow only one object to be created
    String name;
    private SingletonClass(String name){
        this.name = name;
    }

    private static SingletonClass instance;
    
    public static SingletonClass getInstance(String name){
        if (instance == null){
            instance = new SingletonClass(name);
        }
        return instance;
    }

    public static void main(String[] args) {

        //here we cannot call the constructor (hence we cannot make more than one object)

        
        SingletonClass obj1 = SingletonClass.getInstance("My name");
        SingletonClass obj2 = SingletonClass.getInstance("My name");
        SingletonClass obj3 = SingletonClass.getInstance("My name");


        //all 3 reference variables are pointing to just one object
    }
}
