package subset;

import java.util.ArrayList;
import java.util.Arrays;


public class Subseq {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3};
        findSubSeq("", "abc");
        System.out.println(subsetRet("", "abc"));
        findSubSeqAscii("", "abc");
        System.out.println(subsetRetAscii("", "abc"));
        System.out.println(subsetLoop(arr));
        System.out.println(subsetLoop2(arr));
    }
    static void findSubSeq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        findSubSeq(p, up.substring(1));
        findSubSeq(p+ch, up.substring(1));
    }

    static ArrayList<String> subsetRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(p+ch, up.substring(1));
        ArrayList<String>right = subsetRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void findSubSeqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        findSubSeqAscii(p+ch, up.substring(1));
        findSubSeqAscii(p, up.substring(1));
        findSubSeqAscii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subsetRetAscii(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsetRetAscii(p+ch, up.substring(1));
        ArrayList<String> second = subsetRetAscii(p, up.substring(1));
        ArrayList<String>third = subsetRetAscii(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
    //using loops

    static ArrayList<ArrayList<Integer>> subsetLoop(int[] arr){
        //the time complexity is O(n*2^n)
        //space complexity is O(2^n * n) 2^n : total subsets and n: space taken by each subset
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static ArrayList<ArrayList<Integer>> subsetLoop2(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
