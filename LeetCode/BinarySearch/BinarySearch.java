package LeetCode.BinarySearch;
import java.util.*;

public class BinarySearch {
    /*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1. */
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,8,9};
        System.out.println(search(arr, 9));
    }

    static int search(int[] nums , int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] > target){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }
}
