abstract class AbstractClass{    //Abstract class
    abstract public void abstractMethod(); //abstract methods declaration
    public void concreteMethod() { //concrete method
        System.out.println("in a concrete Method");
    }
}
class ConcreteClass extends AbstractClass{  //concrete class
    public void abstractMethod(){ //abstract methods declaration or abstract Method Implementation
        System.out.println("in a Abstract Method");
    }
}
public class Main {
    public static void main(String[] args) {  //you cannot create the object for a abstract class.
        ConcreteClass obj = new ConcreteClass(); // normal object creation
        AbstractClass obj1 =new ConcreteClass(); //dynamic dispatch method
        obj.abstractMethod();
        obj1.concreteMethod();
        System.out.println("Hello, World!");
    }
}