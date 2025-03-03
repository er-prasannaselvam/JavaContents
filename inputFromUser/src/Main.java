import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        // Getting Input from the user by using BufferedReader
        System.out.println("Enter the number:");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int number = 0;
        try {  // or use main method throws IOException
            number = Integer.parseInt(bf.readLine());  //readline method is a String return type
        } catch (IOException e) {      //Integer.parseInt to convert string to integer type
            throw new RuntimeException(e);
        }
        System.out.println(number);

        // Getting Input from the user by using Scanner
        System.out.println("Enter the number1:");
        Scanner number1 = new Scanner(System.in);
        int num = number1.nextInt();
        System.out.println(num);

    }

}