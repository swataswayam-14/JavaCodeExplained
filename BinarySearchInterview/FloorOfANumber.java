package BinarySearchInterview;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,13,18,100,150};
        System.out.println(findFloor(arr, 1, 0, arr.length-1));
        System.out.println(getFloor(arr, 12));
    }
    static int findFloor(int[] arr , int target, int s, int e){
        //floor is the greatest number that is smaller or equal to target number
        if(s<=e){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                if(m == 0){
                    return -1;
                }else{
                    return arr[m-1];
                }
            }
            else if(arr[m] >= target){
            //element is in the left part of the array
                return findFloor(arr, target, s, m-1); 
            }else{
                return findFloor(arr, target, m+1, e);
            }
        }else{
            return arr[e];
        }
    }

    //using loops
    static int getFloor(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }
            else if(mid == 0){
                return -1;
            }
            else{
                return arr[mid-1];
            }
        }

        return arr[end];
    }
}
