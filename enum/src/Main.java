import java.lang.reflect.Array;

enum Rating{ //Rating is Basically class,and also a type
    Average,Moderate,Good,Notbad,worst; // constants
}
enum Result{ //enums for printing statements
    Pass,Fail;
}
enum Correction{
    Right,Wrong;
}
public class Main {
    public static void main(String[] args) {
        Rating rs = Rating.Good; // stored single constant in rs //Rating is a datatype//rs is a Referenced variable
        System.out.println(rs.ordinal());//ordinal methods gives index of the constants
        Rating[] rt = Rating.values();// values methods is used to store all constants values in single Array
        for (Rating ss : rt) { //for printing all constants use "for each loop"
            System.out.println(ss);// Rating=type,ss =for each reference variable,rt = values method object
        }
        {
            //printing statements of constants using if else condition
            Result publishResult = Result.Fail;
            if (publishResult == Result.Pass)
                System.out.println("you passed the exam");
            else if (publishResult == Result.Fail)
                System.out.println("you failed the exam");
            else
                System.out.println("your result not found");
        }
        //Using Switch case for printing statements for the constants
        Correction rw = Correction.Wrong;
        switch (rw) {
            case Right:
                System.out.println("passed");
                break;
            default:
                System.out.println("failed");
        }
}
}



