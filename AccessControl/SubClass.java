package AccessControl;

public class SubClass extends A {
    public SubClass(int num, String name , int sum){
        super(num, name, sum);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(0, null, 0);
        int n = obj.sum; //protected data members can be accessed by subclasses present in the same package or in the subclass of different package
        //but protected data members cannot be accessed in different package which is not subclass
    }
}


//nom modifiers is used when we donot want our data members to be accessed on other packages

