package FAANG;

import java.util.ArrayList;

public class DiceNumberCombinations {
    //AMAZON
    public static void main(String[] args) {
        dice("", 4);
        diceCustom("", 4, 8);
        System.out.println(diceReq("", 4));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(p+i, target-i);
        }
    }

    static ArrayList<String> diceReq(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            list.addAll(diceReq(p+i, target-i));
        }
        return list;
    }

    static void diceCustom(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i<=target; i++) {
            diceCustom(p+i, target-i, face);
        }
    }
}

