import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int salary;
    String name;

    public Employee(String name,int salary) {
        this.salary = salary;
        this.name = name;
    }

    public String toString() {
        return name +":"+salary;
    }

    public int compareTo(Employee that) {
        if (this.salary > that.salary)
            return 1;  //swap
        else
            return -1;   //unswap
        }
    }

    public class Main {
    public static void main(String[] args) {
        List<Employee> employment = new ArrayList<>();
       employment.add(new Employee("Praveen",18000));
        employment.add(new Employee("Rohit",12000));
        employment.add(new Employee("Arjun",25000));
        employment.add(new Employee("Naveen",15000));
        employment.add(new Employee("Manoj",28000));

        Collections.sort(employment);
        employment.forEach(n-> System.out.println(n));
        
        
    }
}