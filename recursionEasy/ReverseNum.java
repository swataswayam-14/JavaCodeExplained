package recursionEasy;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 1234;
        int num = n;
        int x  = 0;
        // while (n!=0) {
        //     n = n/10;
        //     x++;
        // }
        x = (int)(Math.log10(n) + 1); // x is total number of digits
        System.out.println(reverseIt(num, x));
        reverseIt2(num);
        System.out.println(sum);
        System.out.println(reverseIt3(num));

    }
    static double reverseIt(int n, int x){
        if(n == 0){
            return 0;
        }
        int l = n%10;
        return (l*Math.pow(10, x-1)) +  reverseIt(n/10, x-1);
    }

    static int sum = 0;
    static void reverseIt2(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        reverseIt2(n/10);
    }

    static int reverseIt3(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n , int digit){
        if(n==0){
            return 0;
        }
        return (n%10)*(int)(Math.pow(10,digit-1)) + helper(n/10, digit-1);
    }

}
