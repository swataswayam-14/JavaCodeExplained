package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr, 2));
    }

    static int removeElement(int [] nums , int val){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(val != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
