package recursionEasy;

public class ProductOfDigits {
    public static void main(String args[]){
        System.out.println(prod(0));
    }
    static int prod(int n){
        if (n%10 == n){
            return n;
        }
        int r = n%10;
        return r * prod(n/10);
    }
}
