package AccessControl;

public class B {
    public static void main(String[] args) {
        A a = new A(10, "swayam");
        int arr[] = a.getArray();
        System.out.println(arr.length);

        a.updateSize(15);
        arr = a.getArray();
        System.out.println(arr.length);
    }
}
