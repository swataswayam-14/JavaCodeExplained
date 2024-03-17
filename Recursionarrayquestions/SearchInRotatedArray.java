package Recursionarrayquestions;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {6,7,8,9,1,2,3,4,5};
        int s = 0;
        int e = arr.length-1;
        int target = 9;
        System.out.println(findIndex(arr, s, e, target));
    }
    static int findIndex(int arr[] , int s , int e , int target){
        if(s>e){ //element not found
            return -1;
        }
        int m = s +(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){ //the first half of the array is sorted.
            if(target >= arr[s] && target <= arr[m]){ // the target value is between s and m
                return findIndex(arr, s, m-1, target);
            }else{
                return findIndex(arr, m+1, e, target); //the target is not in the range (s,m) hence search it between (m+1, e)
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return findIndex(arr, m+1, e, target);
        }
        return findIndex(arr, s, m-1, target);
    }
}