import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,0,1,4};
        QuickSortRec(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSortRec(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+(e-s)/2;

        int pivot = nums[m];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        QuickSortRec(nums, low,e);
        QuickSortRec(nums, s, high);
    }
}
//T(N) = T(k) + T(n-k-1) + O(n) -> Recurrence relation of quick sort algorithm
//worst case -> T(N) = T(N-1) + O(N)
//the worst case time complexity is O(N^2)
//best case -> T(N) = T(N/2) + T(N/2) + O(N) = 2T(N/2) + O(N)
//best case time complexity is O(NlogN)
//quick sort is not stable
//same order may not be possible as elements were present before (If the elements have the same value)
//merge sort is preferred for linked-in list (As they are not continous memory location)



//Hybrid Sorting algorithms

//Merge sort + Insertion sort (works good for partially sorted data)