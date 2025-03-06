public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int array[] = new int[4];
        String name = null;
        try {    //ArithmeticException
            number1 = 30 / number2;    //critical statement1
        }
        catch (ArithmeticException e) {
            System.out.println("cannot divided by zero" + e);
        }
        try {  //ArrayIndexOutOfBoundsException
            System.out.println(array[4]);   //critical statement2
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of the index limit" + e);
        }
        try {   //NullPointerException
            System.out.println(name.length());   //critical statement3
        }
        catch (NullPointerException e) {
            System.out.println("out of the index limit" + e);
        }
    }
}