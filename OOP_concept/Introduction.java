
package OOP_concept;
import java.util.*;

public class Introduction {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //store 5 roll no
        String[] names = new String[5]; //store names
    
    
        //data of 5 students {rollno , names , marks}
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
    
        Student[] students = new Student[5];
        Student student1 = new Student(); //dynamically allocates memory and returns a reference to it
        System.out.println(Arrays.toString(students));
        System.out.println(student1.marks);
        System.out.println(student1.roll);

        student1.roll = 34;
        student1.name= "swayam";
        student1.marks = 324;
        System.out.println(student1.roll);


    }
 

}

class Student{
    int roll = 90;
    String name;
    float marks;
}

