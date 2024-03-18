import java.util.Arrays;

public class MergeSortRec {
    //divide the array in 2 parts 
    //get both the parts sorted via recursion
    //merge the sorted parts
    public static void main(String[] args) {
        int[] arr = {3,2,6,8,1,2,0,9,4};
        System.out.println("-------------Sorted Array--------------");
        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println("-------------Original Array------------");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("=========Merge sort by referencing the original array==========");
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); //here it is creating new objects for other function calls , but the original array is not being modified as it is not referenced in the function calls
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mergedArray = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j< second.length){
            if(first[i] < second[j]){
                mergedArray[k] = first[i];
                i++;
            }else{
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }

        //for the remaining elements
        while(i<first.length){
            mergedArray[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length) {
            mergedArray[k] = second[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }
        int mid = s + (e-s)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mergedArray = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i<mid && j<e){
            if(arr[i] < arr[j]){
                mergedArray[k] = arr[i];
                i++;
                k++;
            }else{
                mergedArray[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            mergedArray[k] = arr[i];
            i++;
            k++;
        }
        while (j<e) {
            mergedArray[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l<mergedArray.length; l++){
            arr[s+l] = mergedArray[l];
        }
    }
}


/*
At every level n elements are being merged
//the total levels are logn

//the time complexity is O(nlogn)
//the space complexity is O(n)
 */