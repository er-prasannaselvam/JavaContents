import java.util.*;
//if you add,fetch values use Collection-ArrayList
public class Main {
    public static void main(String[] args) { //collection is a Interface
       Collection<Integer> numbers = new ArrayList<Integer>(); //ArrayList is a class,<Integer> is generic datatype of Arraylist
       for(int i =1;i<=50;i++){  //add(); is a method in ArrayList,helps add(enters) values in Array
           numbers.add(i); //these values are not numbers they are "objects"
       }
        System.out.println(numbers);
       for (int list : numbers){ // enhanced for loop for printing one by one
           System.out.println(list);
       }
    }
}