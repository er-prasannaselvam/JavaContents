import java.util.ArrayList;
import java.util.List;
// use List-ArrayList to Access the index value of the element in the List
public class Main {
    public static void main(String[] args) { //list is the Interface
        List<Integer> numbers = new ArrayList<Integer>(); //ArratList class implements List
        for (int i = 1;i<=100;i++){
            numbers.add(i);
        }
        int x = -1; //finding largest number in a list
        for (int j =0;j<=99;j++){
            if (x <= numbers.get(j)) {
                x = numbers.get(j);
            }
        }
        System.out.println(numbers.get(55)); //get method to find element in given specified index value
        System.out.println(numbers.indexOf(65));  //indexOf method to find index value of given element
        System.out.println("The largest number in a list is:"+x);
    }
}