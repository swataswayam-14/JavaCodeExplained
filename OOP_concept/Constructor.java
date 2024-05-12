package OOP_concept;

public class Constructor {
    public static void main(String[] args) {
        Student1 swayam = new Student1();
        System.out.println(swayam.name+' '+swayam.marks+' '+swayam.roll);
        swayam.greeting();

        Student1 subham = new Student1("Subham", 12, 32.32);
        subham.display();
    }
}

//constructor is a special function that runs when we create an object and it allocates some variable

class Student1{
    int roll;
    String name;
    double marks;
    void greeting(){
        System.out.println("hello my name is swata "+name+" Dash");//or this.name
        System.out.println(this.name);
    }
    void display(){
        System.out.println("Name: "+this.name+", Marks: "+this.marks+", Roll Number: "+this.roll);
    }
    void changeName(String newName){
        this.name = newName;
    }
    //we need a way to add the values of the above properties object by object
    Student1 (){
        this.roll = 13;
        this.name= "swayam";
        this.marks = 86.4f;
    }
    Student1(String name, int roll , double marks){
        this.name= name;
        this.roll = roll;
        this.marks = marks;
    }
}
