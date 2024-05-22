package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafunction {

    private int operate(int a , int b, Operation op){
        return op.operation(a, b);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

        Consumer<Integer> fun = (item) -> System.out.println(item*2);

        arr.forEach(fun);
        Operation sum = (a, b)-> (a+b);
        Operation diff = (a, b)-> (a-b);
        Operation prod = (a, b)-> (a*b);
        Operation div = (a, b)-> (a/b);
        Operation rem = (a, b)-> (a%b);

        Lambdafunction myCalculator = new Lambdafunction();
        System.out.println(myCalculator.operate(2, 4, sum));
        System.out.println(myCalculator.operate(2, 4, diff));
        System.out.println(myCalculator.operate(2, 4, prod));
        System.out.println(myCalculator.operate(4, 2, div));
        System.out.println(myCalculator.operate(7, 4, rem));
    }
    
}

interface Operation{
    int operation(int a , int b);
}
