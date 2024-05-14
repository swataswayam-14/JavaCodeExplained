package OOP_concept.Inheritance;

public class Main {
    public static void main(String[] args) {
        InheritanceExample Box = new InheritanceExample();
        InheritanceExample Box1 = new InheritanceExample(12.23,34.54,12.43);
        InheritanceExample Box2 = new InheritanceExample(Box1);
        InheritanceExample Box3 = new InheritanceExample(34);

        System.out.println("Box "+Box.length+" "+Box.width+" "+Box.height);
        System.out.println("Box1 "+Box1.length+" "+Box1.width+" "+Box1.height);
        System.out.println("Box2 "+Box2.length+" "+Box2.width+" "+Box2.height);
        System.out.println("Box3 "+Box3.length+" "+Box3.width+" "+Box3.height);
        System.out.println();
        System.out.println();
        System.out.println("-----------Inherited class--------");
        BoxWeightChild box4 = new BoxWeightChild();
        BoxWeightChild box5 = new BoxWeightChild(34,45);
        BoxWeightChild box6 = new BoxWeightChild(12,12,24,190);
        System.out.println("box4 "+box4.length+" "+box4.width+" "+box4.height+" "+box4.weight);
        System.out.println("box5 "+box5.length+" "+box5.width+" "+box5.height+" "+box5.weight);
        System.out.println("box6 "+box6.length+" "+box6.width+" "+box6.height+" "+ box6.weight);





        InheritanceExample Boxx = new BoxWeightChild(2,3,4,5);
        System.out.println(Boxx.length);
        System.out.println(Box.width);
        //System.out.println(Box.weight); cannot access weight


        // BoxWeightChild boxxx = new InheritanceExample(1,2,3); Not possible as weight cannot be initialised by parent class constructor
    }


    //it is the type of the reference variable and not the type of the object that determines what members can be accessed

    //when a reference to a subclass object is assigned to a super class reference variable. We will have access to only those parts of the object that are defined in the super class.

    
    
}
