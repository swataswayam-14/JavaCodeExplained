package recursionEasy;
public class PrintNumbers{
    public static void main(String args[]){
        System.out.println("printing reverse");
        print(5);
        System.out.println("printing seq by passing 1");
        printSeq(1);
        System.out.println("printing seq by passing 5");
        print2(5);
        System.out.println("printing all (in a circle)");
        print3(5);
    }
    static void print(int n){
        
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void printSeq(int n){
        
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printSeq(n+1);
    }
    static void print2(int n){
        
        if(n != 1){
            print2(n-1);
        }
        System.out.println(n);
    }
    static void print3(int n){
        if(n==1){
            System.out.println(1);
        }
        if(n != 1){
            System.out.println(n);
            print3(n-1);
        }
        System.out.println(n);
    }
}