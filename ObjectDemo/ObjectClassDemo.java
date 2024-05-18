package ObjectDemo;

public class ObjectClassDemo {
    //all the function present in the Object class that can be overriden

    int num;

    public ObjectClassDemo(int num){
        this.num = num;
    }

    @Override
    public int hashCode(){ //A unique representation of an object via a number
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        //overriden
        if (this.num == ((ObjectClassDemo)obj).num){
            return true;
        }else{
            return false;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){ //string reperesentation of the object
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{ //gets called when garbage collector deletes a object
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClassDemo obj = new ObjectClassDemo(34);
        System.out.println(obj.hashCode());
        ObjectClassDemo obj2 = new ObjectClassDemo(34);
        System.out.println(obj2.hashCode());
        ObjectClassDemo obj3 = obj;
        System.out.println(obj3.hashCode());

        if(obj.equals(obj2)){
            System.out.println("These objects are equal");
        }
    }
}
