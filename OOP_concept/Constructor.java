package OOP_concept;

public class Constructor {
    public static void main(String[] args) {
        Student1 swayam = new Student1();
        System.out.println(swayam.name+' '+swayam.marks+' '+swayam.roll);
        swayam.greeting();

        Student1 subham = new Student1("Subham", 12, 32.32);
        subham.display();

        Student1 random = new Student1(subham);
        random.display();

        Student2 mayank = new Student2();
        System.out.println(mayank.name);

        Student2 one = new Student2();
        one.name = "Hello somethings";
        Student2 two = one;
        System.out.println(two.name);
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
    }//Constructor Overloading

    //Student1 mahaRishi = new Student1("maha", 123, 134.24)
    //here this will be replaced by "mahaRishi"
    Student1(String name, int roll , double marks){
        this.name= name;
        this.roll = roll;
        this.marks = marks;
    }

    Student1(Student1 other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }
}


class Student2{
    String name;
    float height;
    Student2(){
        this("Steguf Billu", 156.4f);
    }
    Student2(String name , float height){
        this.name = name;
        this.height = height;
    }
}
