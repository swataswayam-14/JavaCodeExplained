
package BinarySearchInterview;
import java.util.*;
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,3,4,5};
        searchRange(nums,3, 0, nums.length-1);
        
    }
    static ArrayList<Integer> ans = new ArrayList<>();

    static void searchRange(int[] nums , int target, int s , int e){
        if(s>=e){
            int m = s + (e-s)/2;

            if(nums[m] == target){
                ans.add(m);
            }
            else if(nums[m] > target){
                searchRange(nums, target, s, m-1);
            }else{
                searchRange(nums, target, m+1, e);
            }
        }else{
            System.out.println(ans);
            return;
        }
    }
}
