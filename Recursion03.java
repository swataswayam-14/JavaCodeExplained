public class Recursion03 {
    public static void main(String args[]){
        print(1);
    }
    static void print(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1); //this is tailed recursion
    }
}
//recursion : function that calls itself

//as many time the function (wether itself or different) is called it will take memory in the stack