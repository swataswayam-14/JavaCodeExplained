package CustomArrayList;

public class CustomAL {
    private int size = 0;
    private int DEFAULT_SIZE = 10;
    int data[];
    public CustomAL(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        int temp[] = new int[data.length *2];

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

    public int remove(){
        int removedEL = data[--size];
        return removedEL;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index , int value){
        data[index] = value;
    }

    public static void main(String[] args) {
        CustomAL ownAl = new CustomAL();
        
        for (int i = 0; i < 30; i++) {
            ownAl.add(i);
        }

        ownAl.display();

        System.out.println(ownAl.remove());
        ownAl.display();

        System.out.println(ownAl.get(4));
        ownAl.set(4,0);
        ownAl.display();
        System.out.println(ownAl.size());
    }
}
