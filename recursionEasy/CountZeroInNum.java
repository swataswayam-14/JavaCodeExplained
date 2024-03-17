package recursionEasy;

public class CountZeroInNum {
    public static void main(String[] args) {
        System.out.println(countZeros(1000));
        System.out.println(countZeros2(1023400));
    }
    static int countZeros(int n){
        int count = 0;
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        if(rem == 0){
            count += 1;
        }
        return count + countZeros(n/10);
    }
    static int countZeros2(int n){
        return helper(n, 0);
    }
    static int helper(int n, int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
