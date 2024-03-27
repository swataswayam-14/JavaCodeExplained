package LeetCode.BinarySearch;

public class GuessNumHighOrLow {
    //Guess Number Higher or Lower
    public static void main(String[] args) {
        
    }
    static int guessNumber(int n){
        int s = 0;
        int e = n;
        
        while(s<=e){
            int m = s + (e-s)/2;
            if(guess(m) == -1){
                e = m-1;
            }else if(guess(m) == 1){
                s = m+1;
            }else{
                return m;
            }
        }
        return 0;
    }
    static int guess(int n){
        return 1;
    }
}
