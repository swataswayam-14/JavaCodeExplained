package GenericInterface;

public class Main  implements GenericInterface<Number>{
    @Override
    public void display(Number val){
        System.out.println(val);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display(13);
        obj.display(12.32f);
    }
}
