public class BinarySearch{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int s = 0;
        int e = arr.length -1;

        System.out.println(binarysearch(arr, 3, s, e));
    }
    static int binarysearch(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }else if(arr[m]< target){
            return binarysearch(arr, target, m+1, e);
        }
        return binarysearch(arr, target, s, m-1);
    }
}