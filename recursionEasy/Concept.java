package recursionEasy;

public class Concept {
    //                                                        --n vs n--
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        //fun(n--); leads to infinite recursion as the value is passed to the next function call and then decremented by 1 , so always it is passed 5 and then decremented and again passed 5
        fun(--n); // here the value of n is first decremented and then passed to the next function call
    }
}
