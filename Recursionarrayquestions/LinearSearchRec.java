package Recursionarrayquestions;

import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,6,1,7,9,12,45};
        ArrayList<Integer> lst = new ArrayList<>();
        int target = 3;
        System.out.println(isFound(arr, 0, target));
        findAllIndex(arr,3, 0);
        System.out.println(list);
        System.out.println(findAll2(arr, target, 0, lst));
        System.out.println(findAll3(arr, target, 0));
    }

    static boolean isFound(int arr[], int i, int target){
        if(i > arr.length-1){
            return false;
        }
        if(arr[i] == target || isFound(arr, i+1, target)){
            return true;
        }
        return false;
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int target, int index){
        if(index> arr.length-1){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
    static ArrayList<Integer> findAll2(int arr[], int target, int index, ArrayList<Integer> list){
        if(index > arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        } 
        return findAll2(arr, target, index+1, list);
    }

    //goal : create the arraylist in the body of the function, instead of passing it in the parameter
    static ArrayList<Integer> findAll3(int arr[] , int target, int index){
        //not optimised as it is creating object again and again in each function call
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = findAll3(arr, target, index+1);
        list.addAll(ansFromBelow);
        return list;
    }

}
