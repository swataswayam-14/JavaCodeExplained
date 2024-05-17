package AccessControl;

import java.util.ArrayList;

public class A {
    private int num;
    String name;
    int arr[];
    A(int num, String name){
        this.name = name;
        this.num = num;
        this.arr = new int[num];
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
    }
}
