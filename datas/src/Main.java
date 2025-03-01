import java.sql.Array;
import java.util.Arrays;

interface interval1{
    public int a1();
}
interface interval2{
    public String name ();
}
class interpace implements interval1,interval2 {
    public  int a1(){
        int a=50;
        int b=150;
        int c = a+b;
        System.out.println(c );
        return 0;
    }
    public String name(){
        String pace ="prasanna";
        System.out.println(pace.toUpperCase());
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
      interpace wrong =new interpace();
      wrong.a1();
      wrong.name();
      innerclass copy =new innerclass();
      copy.print();
      innerclass.innerclass2 opp = copy. new innerclass2();
      opp.print2();
        innerclass.innerclass2.innerclass3 opj =opp.new innerclass3();
        opj.print3();

    }


}