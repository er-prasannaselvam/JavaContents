import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i =1;i<=100;i++){
                numbers.add(i);
        }
        Stream<Integer> s1 = numbers.stream();
        Stream<Integer> s2 = s1.filter(even->even%2==0); //filter only even numbers
       Stream<Integer> s3 = s2.map(add3->add3+3);
       Stream<Integer> s4 = s3.sorted();
        s4.forEach(result->System.out.println(result));
    }
}