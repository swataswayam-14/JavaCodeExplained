package ExceptionHandeling;

public class Main {
    public static void main(String[] args) {
        try {
            //int c = divide(4, 0);
            //System.out.println(c);
            throw new MyException("My exception");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch(MyException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("finally will always be executed");
        }
    }

    static int divide(int a , int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("division by zero is not possible");
        }
        return a/b;
    }
}
