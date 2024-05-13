package OOP_concept.StaticExample;

public class StaticBlock {

    //develop a thing to initialize these static variables

    static int a = 4;
    static int b;

    //we can do this by a static block, and the static block will be executed exactly once when the class is first loaded

    static{
        //will run once , when the first object is created i.e. when the class is loaded for the first time
        System.out.println("-----Inside the static block-----");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock newObj = new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);
    }

}
