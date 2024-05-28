package SortingAlgorithm;

import java.util.ArrayList;

public class LinearSearch2d {
    public static void main(String[] args) {
        int arr[][] = {
            {121,22,3121,41,5},
            {146,412,864,34,23},
            {12,324,654,12}
        };
        int arr2[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        ArrayList<Integer> index = linearSearch(arr, 864);
        System.out.println(index);

        ArrayList<Integer> index21 = new ArrayList<>();
        ArrayList<Integer> index2 = search(arr2, 7, index21, 0, 0);
        System.out.println(index2);
        
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

    //if the array is sorted in a row and column wise

    public static ArrayList<Integer> search(int arr[][], int target, ArrayList<Integer> index, int i, int j) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {
            if (arr[i][j] < target) {
                search(arr, target, index, i, j + 1);
            } else if (arr[i][j] == target) {
                index.add(i);
                index.add(j);
                return index;
            } else {
                search(arr, target, index, i - 1, j);
            }
        }
        return index;
    }

}

//7

// 1,2,3,4
// 5,6,7,8,
// 9,10,11,12