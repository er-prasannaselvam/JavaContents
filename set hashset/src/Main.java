import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) { //Set only having unique values of element
        Set<Integer> registerNumber = new HashSet<>(); //Hashset gives unsorted order of elements
        int registerStartsFrom = 5100;
        for (int a = 1;a<=10;a++){
            registerStartsFrom++;
            registerNumber.add(registerStartsFrom);
        }
        System.out.println(registerNumber);
        for (int x : registerNumber){ //enhanced for loop for printing one by one (unsorted)
            System.out.println(x);
        }
    }
}