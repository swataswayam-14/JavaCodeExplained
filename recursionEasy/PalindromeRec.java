package recursionEasy;

public class PalindromeRec {
    public static void main(String[] args) {
        int n = 121121;
        System.out.println(reverseNum(n));
        if(palin(n)){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }

    }
    static int reverseNum(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }
    static int helper(int n, int digit){
        if (n==0){
            return 0;
        }
        return (n%10)*(int)(Math.pow(10,digit-1)) + helper(n/10, digit-1);
    }
    static boolean palin(int n){
        if(n == reverseNum(n)){
            return true;
        }
        return false;
    }
}
