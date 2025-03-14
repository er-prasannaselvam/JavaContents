import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("prasanna");
        names.add("praveen");
        names.add("bragadeshwaran");
        names.add("loganathan");
        names.add("arun");
        names.add("ragulkanna");
        Comparator<String> names2 = new Comparator<String>() {   //anonymous method
            public int compare(String x, String y) {
                if (x.length()>y.length())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(names,names2);//give object of the comparator in sort
        for (int a =0;a<names.size();a++){ //size method to find the size of the list
            System.out.println(names.get(a));
        }
    }
}