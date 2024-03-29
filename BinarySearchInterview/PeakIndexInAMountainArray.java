package BinarySearchInterview;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,4,3,2,1};
        System.out.println(peakIndex(arr));
        System.out.println(peakIndexOptimised(arr));
    }

    static int peakIndex(int[] arr){
        //brute force
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    static int peakIndexOptimised(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }else if(arr[mid] > arr[mid+1]){ // in the decreasing part of the array [1,2,3,4,2,1], hence the ans must lie in the left
                end = mid-1;
            }else{ // in the increasing part of the array hence the answer must lie in the right
                start = mid+1;
            }
        }
        return -1;
    }
}
