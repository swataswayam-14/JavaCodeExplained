package RecursionPatterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,6,3,1,2,9};
        int r = arr.length-1;
        // ssSort(arr, r);
        System.out.println(Arrays.toString(arr));
        ssSortRec(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static int max = 9;
    static void ssSort(int[] arr, int r){
        if(r == -1){
            return;
        }
        int maxIndex = 0;
        for (int i = 1; i < r+1; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
    
        //swap the last element of the array with the element which is maximum in the array
        int temp = arr[r];
        arr[r] = arr[maxIndex];
        arr[maxIndex] = temp;
        ssSort(arr, r-1);
    }

    //pure recursion

    static void ssSortRec(int[] arr,int n, int i, int max){
        if(n == 0){
            return;
        }
        if(i<n){
            if(arr[i] > arr[max]){
                ssSortRec(arr, n, i+1, i);
            }else{
                ssSortRec(arr, n, i+1, max);
            }
        }else{
            int temp = arr[n-1];
            arr[n-1] = arr[max];
            arr[max] = temp;

            ssSortRec(arr, n-1, 0, 0);
        }
    }
}
