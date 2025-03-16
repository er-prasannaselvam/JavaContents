
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("adam", 75);
        students.put("alan", 80);
        students.put("david", 60);
        students.put("john", 91);
        students.put("laura", 72);
        students.put("melena", 55);
        students.put("nicholson", 65);
        students.put("peter", 90);
        students.put("rick", 92);
        students.put("shelly", 78);
        System.out.println("marks:"+students.get("rick"));
        students.forEach((name, marks) -> System.out.println("Name:"+name+","+"Marks scored in this Subject is"+marks));
    }
}