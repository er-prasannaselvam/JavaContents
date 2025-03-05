public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
             b = 50/a; //critical statement
            System.out.println("the answer is:"+b);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divided by zero"+e);
        }
    }
}