import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//sorting based on last two digits of the number
public class Main {
    public static void main(String[] args) {
        List<Integer> sortedlist = Arrays.asList(108,465,688,566,344,546,977);
        Comparator<Integer> comp = (i,  j) -> {
            if (i%100>j%100)
                return 1;  //swap  //return i%100>j%100?1:-1; //ternary operation
            else
                return -1;  //unswap
        };
        Collections.sort(sortedlist,comp);
        System.out.println(sortedlist);
        sortedlist.forEach(n-> System.out.println(n));
    }
}