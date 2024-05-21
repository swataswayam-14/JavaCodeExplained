package CustomArrayList;

public class GenericCustomArrayList<T> {
    private int size = 0;
    private int DEFAULT_SIZE = 10;
    private Object data[];
    public GenericCustomArrayList(){
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
    public static void main(String[] args) {
        GenericCustomArrayList<String> obj = new GenericCustomArrayList<>();

        for (int i = 0; i < 12; i++) {
            obj.add("swayam");
        }

        obj.display();

        for (int i = 0; i < obj.size(); i++) {
            if( i%2 == 0){
                obj.set(i, "steguf");
            }
        }

        obj.display();
        System.out.println(obj.remove());
        obj.display();
    }
}
