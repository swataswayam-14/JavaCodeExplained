package recursionEasy;

public class SumOfDigits {
    public static void main(String args[]){
        System.out.println(sum(54321));
    }
    static int sum(int n){
        if(n!=0){
            int r = n%10;
            return r + sum(n/10);
        }
        return 0;
    }
}
