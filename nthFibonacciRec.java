public class nthFibonacciRec {
    public static void main(String args[]){
        System.out.println(fib(7));
    }
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2); //this is not tailed recursion
    }
}
