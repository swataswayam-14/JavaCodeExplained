package CompareObjects;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks){
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo( Student other){
        if(this.marks > other.marks){
            return 1;
        }else if(this.marks == other.marks){
            return 0;
        }else{
            return -1;
        }
    }


}
