import java.util.ArrayList;

public class HappyNumberGoogle {
    public static void detect(int num){
        ArrayList<Integer> list = new ArrayList<>();

        int temp = num;
        temp = num;
        while(true){
            int sum = 0;
            while(temp!= 0){
                int lastDigit = temp%10;
                temp = temp/10;
                sum += (lastDigit*lastDigit);
            }
            if(list.indexOf(sum) != -1){
                System.out.println("The number "+num +" is not a happy number");
                return;
            }
            if(sum == 1){
                System.out.println("The number "+num +" is a happy number");
                return;
            }
            list.add(sum);
            temp = sum;
        }
    }
    public static void main(String[] args) {
        detect(91);
    }
}
