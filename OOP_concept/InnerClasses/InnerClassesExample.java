package OOP_concept.InnerClasses;

//the outer class cannot be static , the inner classes may or may be static

public class InnerClassesExample {
    public class A {
        String name;

        A(String name){
            this.name = name;
        }
        
    }

    static class B{
        String name;
        public B(String name){
            this.name = name;
        }
    }
    
    public static void main(String[] args) {
        //A a = new A("hello");  ==> error as a non static class cannot be referenced inside a static method , as the class is dependent on the outer class (i.e.  InnerClassesExample) 


        Test S = new Test("hello");
        Test M = new Test("good bye");

        System.out.println(Test.name);
        System.out.println(Test.name);

        B x = new B("Hello");
        B y = new B("good bye");

        System.out.println(x.name);
        System.out.println(y.name);
    }
}


class Test{
    static String name;
    public Test(String name){
        Test.name = name;
    }
}



//since static methods donot depend on objects and objects are created in the run time , hence static methods are resolved during compile time (They are class level methods)