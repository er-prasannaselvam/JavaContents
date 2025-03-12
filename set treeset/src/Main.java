import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> registerNumber = new TreeSet<>(); //TreeSet gives sorted order of elements
        int registerStartsFrom = 6500;
        for (int a = 1; a <= 30; a++) {
            registerStartsFrom++;
            registerNumber.add(registerStartsFrom);
        }
        System.out.println(registerNumber);
        Iterator<Integer> getRegisterNumber = registerNumber.iterator();
        while (getRegisterNumber.hasNext()){
        System.out.println(getRegisterNumber.next());
        }
    }
}

