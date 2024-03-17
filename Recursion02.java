public class Recursion02 {
    public static void main(String args[]){
        //print numbers from 1 to 5
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    //function body here changes
    static void print5(int n){
        System.out.println(n);
    }
}

//whenever a function is called it is stored in the stack memory and once it finishes executing it is removed from the stack and returns to where it has been called


//if all of these function have the same body and are doing the same things then why to create them again and again?


//simple solution : call this function itself
