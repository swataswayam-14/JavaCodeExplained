package LeetCode.BinarySearch;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int [] nums){
        int[] squares = new int[nums.length];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = nums[i] * nums[i];
        }
        Arrays.sort(squares);
        return squares;
    }
}
