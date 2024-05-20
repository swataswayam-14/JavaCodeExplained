package interfaces.nestedInterfaces;

public class A {
    public interface NestedOne{
        boolean isOdd(int num);
    }
}

class B implements A.NestedOne{
    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}

//nested interface can be declared as public , private or protected but the top level interface has to be declared as public or the default one


class Main{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.isOdd(8));
    }
}
