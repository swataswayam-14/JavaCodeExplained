package CustomArrayList;

public class restrictedTypeArrayList<T extends Number> {

    //the type of the arraylist can only be float , integer and double
    private int size = 0;
    private int DEFAULT_SIZE = 10;
    private Object data[];
    public restrictedTypeArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object temp[] = new Object[data.length *2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public void display(){
        int count = 0;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            
            if(count == size-1){
                System.out.print(data[i]);
            }else{
                System.out.print(data[i]+", ");
            }
            count++;
        }
        System.out.print("]");
        System.out.println();
    }

    public T remove(){
        T removedEL = (T)(data[--size]);
        return removedEL;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index , T value){
        data[index] = value;
    }
}
