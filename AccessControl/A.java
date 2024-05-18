package AccessControl;

import java.util.ArrayList;

public class A {
    protected int sum;
    private int num;
    String name;
    int arr[];
    public A(int num, String name, int sum){
        this.name = name;
        this.num = num;
        this.arr = new int[num];
        this.sum = sum;
    }
    public int[] getArray(){
        return arr;
    }
    public void updateSize(int size){
        this.num = size;
        this.arr = new int[num];
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //list.DEFAULT_CAPACITY : cannot access private data members
        A a = new A(12,"afaf", 23);
        int n = a.num;
        String name = a.name;
        System.out.println(n+" "+name);

        //in the same package and in the same file we can access both the data members which are declared private or not declared anything
    }
}
