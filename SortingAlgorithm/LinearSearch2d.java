package SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

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

        int arr3[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {12,24,56}
        };


        ArrayList<Integer> index = linearSearch(arr, 864);
        System.out.println(index);

        System.out.println(Arrays.toString(search(arr2, 8)));

        System.out.println(Arrays.toString(searchSorted(arr3, 24)));
        System.out.println(Arrays.toString(searchOptimised(arr3, 24)));
        
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

    static int[] search(int arr[][], int target){
        int r = 0;
        int c = arr[0].length-1;

        while (r < arr.length && c>=0) {
            if(arr[r][c] == target){
                return new int[]{r,c};
            }else if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    //search in a sorted matrix: 

    static int[] searchSorted(int arr[][], int target){
        int r = 0;
        int c = arr[0].length-1;
        while (r < arr.length && c >= 0) {
            int lb = arr[r][0];
            int up = arr[r][arr[0].length-1];

            if(target > lb && target < up){
                for (int i = 0; i < arr[0].length; i++) {
                    if(target == arr[r][i]){
                        return new int[]{r,i};
                    }
                }
            }else if(target > up){
                r++;
            }else if(target == lb){
                return new int[]{r,0};
            }else{
                return new int[]{r,arr[0].length-1};
            }
        }
        return new int[]{-1,-1};
    }

    //optimised search algorithm : O(logn) TC

    static int[] binarySearch(int[][] matrix , int row , int cStart, int cEnd, int target){ //search in the row provided between the columns provided
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }else if(matrix[row][mid] < target){
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searchOptimised(int [][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        //run the loop till 2 rows are remaining

        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        //now we have 2 rows
        //check wether the target is in the col of 2 rows

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        //search in 1st half
        if(target <= matrix[rStart][cMid] -1){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cMid] + 1){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        //search in 3rd half
        if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        //search in 4th half
        else{
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }

    }

}

//7

// 1,2,3,4
// 5,6,7,8,
// 9,10,11,12