package RecursionPatterns;

public class Pattern {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int r = arr.length - 1;
        int c = 0;
        bubbleSort(arr, r, c);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        printPattern(4);
        printPattern2(4, 0);
        printPattern3(4, 0);
    }
    static void printPattern(int n){
        int i = n;
        if(n ==0){
            return;
        }
        while(i!=0){
            System.out.print('*');
            i--;
        }
        System.out.println();
        printPattern(n-1);
    }
    static void printPattern2(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print('*');
            printPattern2(r, c+1);
        }else{
            System.out.println();
            printPattern2(r-1, 0);
        }
    }
    static void printPattern3(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            printPattern3(r, c+1);
            System.out.print('*');
        }else{
            printPattern3(r-1, 0);
            System.out.println();
        }
    }
    static void bubbleSort(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }else{
            bubbleSort(arr, r-1, 0);
        }
        
    }
    
}
