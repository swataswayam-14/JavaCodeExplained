package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human swayam = new Human("swayam", 20);
        Human twin = (Human)swayam.clone(); //clone will copy all the values from one object to another object
        System.out.println(twin.name);

        Human twinMoreOverhead = new Human(swayam); //in efficient : more program overhead because of new keyword
        System.out.println(twinMoreOverhead.age);

        System.out.println(Arrays.toString(twin.arr)); //its pointing to the same object , hence any change in the twin will be reflected in the original arr
        twin.arr[0] = 10000;
        System.out.println(Arrays.toString(swayam.arr)); 


        //deepTwin is a deep copy of swayam
        Human deepTwin = (Human)swayam.DeepClone();
        deepTwin.arr[0] = 121212;
        System.out.println(Arrays.toString(swayam.arr));
        System.out.println(Arrays.toString(deepTwin.arr));

        deepTwin.name = "deep twin";
        System.out.println(swayam.name);
    }
}
