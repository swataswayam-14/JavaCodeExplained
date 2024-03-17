package Recursionarrayquestions;
//find if the array is sorted or not
public class SortedArrayRec {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,9,2,4,5,6};
        System.out.println(checkSorted(arr, 0));
    }
    static boolean checkSorted(int arr[], int si){
        if((si == arr.length-1)){
            return true;
        }
        if(arr[si] < arr[si+1] && checkSorted(arr, si+1)){
            return true;
        }
        return false;
    }
}
