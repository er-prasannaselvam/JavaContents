class A{
    public void show1(){
        System.out.println("show1");
    }
}
class B extends A{
    public void show2(){
        System.out.println("show2");
    }
}
public class Main {
    public static void main(String[] args) {
           int x =12;
           double y =(double) x;     //typecasting
        System.out.println(y);

        //up casting->convert subclass obj var into ref var of super class

        A obj = new B();
        obj.show1();

//        downcasting->convert superclass ref var into sub class obj var
        B obj1 = (B) obj;
        obj1.show2();
    }
}