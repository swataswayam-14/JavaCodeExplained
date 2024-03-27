package LeetCode.BinarySearch;

public class ArrangingCoins {
    /*You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build. */
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }

    static int arrangeCoins(int n){
        int i = 0;
        while(n!=0){
            if(n-i < 0){
                return i-1;
            }
            n = n-i;
            i++;
        }
        return i-1;
    }
}
