package polymorphism;

public class Numbers {
    int sum(int a , int b){
        System.out.println("int sum(int a , int b) is called");
        return a+b;
    }
    int sum(int a , int b , int c){
        System.out.println("int sum(int a , int b, int c) is called");
        return a+b+c;
    }
    float sum(float a , float b, float c){
        System.out.println("float sum(float a , float b, float c) is called");
        return a+b+c;
    }
    double sum(float a , float b){
        System.out.println("double sum(float a , float b) is called");
        return a+b;
    }
    double sum(double a , double b){
        System.out.println("double sum(double a , double b) is called");
        return a+b;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.sum(1.1f, 12.2f));
        System.out.println(obj.sum(12.2, 12.67));
        System.out.println(obj.sum(1,2,3));
        System.out.println(obj.sum(1.1f,2.22f,12.21f));
    }
}
