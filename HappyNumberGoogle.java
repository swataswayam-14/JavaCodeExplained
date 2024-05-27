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

    public static boolean isHappy(int num){
        int slow = num;
        int fast = num;
    
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast && slow != 1);
    
        if(slow == 1){
            System.out.println("The number " + num + " is a happy number");
            return true;
        }
        System.out.println("The number " + num + " is not a happy number");
        return false;
    }
    
    private static int findSquare(int num){
        int square = 0;
        while (num != 0) {
            int l = num % 10;
            square += (l * l);
            num = num / 10;
        }
        return square;
    }
    public static void main(String[] args) {
        detect(91);
        System.out.println(isHappy(19));
    }
}
