package LeetCode.BinarySearch;
import java.util.*;

public class SearchInsertPosition {
    /*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity. */

    public static void main(String[] args) {
        int target = 0;
        int[] nums = {1,2,4};
        System.out.println(searchInsert(nums, target));
        //1,2,4
    }

    static int searchInsert(int [] nums , int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int m = s +(e-s)/2;
            if(nums[m] == target){
                return m;
            }
            else if (nums[m]< target) {
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return s;
    }
}
