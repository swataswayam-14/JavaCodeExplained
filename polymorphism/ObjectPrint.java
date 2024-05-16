package polymorphism;

public class ObjectPrint { //by default in java every class extends the Object class
    int num;


    ObjectPrint(int num){
        this.num = num;
    }
    @Override
    public String toString(){
        return "The Object is of the class ObjectPrint , which has the number: "+num;
    }

    public static void main(String[] args) {
        ObjectPrint newObj = new ObjectPrint(12);
        System.out.println(newObj);
    }
    
}
