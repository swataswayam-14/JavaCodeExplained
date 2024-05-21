package CompareObjects;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student(12, 123.32f);
        Student stud2 = new Student(4, 13.34f);

        if(stud1.compareTo(stud2) == 1){
            System.out.println("Student 1 has scored more marks");
        }else{
            System.out.println("Student 2 has scored more marks");
        }
    }
}
