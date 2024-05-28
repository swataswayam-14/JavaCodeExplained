package SortingAlgorithm;

import java.util.ArrayList;

public class LinearSearch2d {
    public static void main(String[] args) {
        int arr[][] = {
            {121,22,3121,41,5},
            {146,412,864,34,23},
            {12,324,654,12}
        };
        ArrayList<Integer> index = linearSearch(arr, 864);
        System.out.println(index);
    }

    public static ArrayList<Integer> linearSearch(int arr[][], int target){
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == target){
                    index.add(i);
                    index.add(j);
                    return index;
                }
            }
        }
        return null;
    }
}
