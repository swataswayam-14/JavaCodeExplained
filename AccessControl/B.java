package AccessControl;

public class B {
    public static void main(String[] args) {
        A a = new A(10, "swayam", 123);
        int arr[] = a.getArray();
        System.out.println(arr.length);

        a.updateSize(15);
        arr = a.getArray();
        System.out.println(arr.length);

        //int n = a.num; cannot access this
        String name = a.name;
        System.out.println(" "+name);

        //in the same package but in different file we cannot access the private declared data members but we can access the other data members
    }
}
