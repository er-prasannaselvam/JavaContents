import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main { //String sorting
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("arun");
        names.add("balaji");
        names.add("prabhu");
        names.add("prasanna");
        names.add("rahul");
        names.add("anand");
        Collections.sort(names);
        System.out.println(names);
        names.forEach(names2 -> System.out.println(names2));
    }
}