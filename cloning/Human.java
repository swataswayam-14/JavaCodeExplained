package cloning;

public class Human implements Cloneable{
    String name;
    int age;
    int arr[];
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{1,2,3,4,5,6};
    }

    public Human(Human other){
        this.name = other.name;
        this.age = other.age;
        this.arr = other.arr;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone(); //shalow copy of the object
    }

    public Object DeepClone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone(); //shallow copy
        twin.arr = new int[this.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
