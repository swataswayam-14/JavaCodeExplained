package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    //digits = [1,2,3] output = [1,2,4] that is 123+1 = 124
    static int[] plusOne(int[] digits){

        String num = arrayToString(digits);
        int number = Integer.parseInt(num);
        number = number + 1;
        String output = String.valueOf(number);
        int len = output.length();
        int [] digitOutput = new int[len];
        for (int i = 0; i < digitOutput.length; i++) {
            digitOutput[i] = output.charAt(i);
        }
        return digitOutput;

    }
    static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
