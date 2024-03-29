package BinarySearchInterview;

public class FindPositionOfAnElementInASortedInfiniteArray {
    //donot use arr.length ( assume that we donot know the size)

    //solve by chunks
    
    //at every step double the size (doubling the size of the array)

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,8,9,12,34,67};
        System.out.println(ans(arr, 67));
    }
    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1;
        while(arr[end] != Integer.MAX_VALUE && target > arr[end]){
            int newStart = end+1;
            int newEnd = end + (end-start + 1)*2;

            end = newEnd;
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }

    static int binarySearch(int[] arr , int start , int end, int target){
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
