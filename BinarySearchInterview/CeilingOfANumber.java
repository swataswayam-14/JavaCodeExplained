package BinarySearchInterview;


//find the smallest number in the array that is greater than or equal to the target number
public class CeilingOfANumber {
    
    public static void main(String[] args) {
        int[] arr = {1,13,18,100,150};
        System.out.println(findCeiling(arr, 13, 0, arr.length-1));
        System.out.println(getCeiling(arr, 150));
    }
    static int findCeiling(int[] arr , int target, int s, int e){
        if(s<=e){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                if(m == arr.length-1){
                    return -1;
                }else{
                    return arr[m+1];
                }
            }
            else if(arr[m] >= target){
            //element is in the left part of the array
                return findCeiling(arr, target, s, m-1); 
            }else{
                return findCeiling(arr, target, m+1, e);
            }
        }else{
            return arr[s];
        }
    }

    //using loops

    static int getCeiling(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else if(mid == arr.length-1){
                return -1;
            }
            else{
                return arr[mid+1];
            }
        }
        return arr[start];
    }


}
