import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int i;
        System.out.println("enter the size of Array:");
        Scanner numbers = new Scanner(System.in);
        i = numbers.nextInt();
        int digits[] = new int[i];
        System.out.println("enter the elements values:");
        for (int x= 0;x<i;x++){
            digits[x]=numbers.nextInt();
        }
        System.out.println(digits[i/2]);

//        int i;
//        for (i=0; i < 5; i++) {
//            digits[i] = numbers.nextInt();
//            }
//        for (i=0;i<5;i++){
//            System.out.println(digits[i]);
//    }



//        digits[0] = numbers.nextInt();
//        digits[1] = numbers.nextInt();
//        digits[2] = numbers.nextInt();
//        digits[3] = numbers.nextInt();
//        digits[4] = numbers.nextInt();
//        System.out.println(digits[4]);
    }
}