class OuterClass {
    public void show() {
        System.out.println("in a outer show");
    }

    class InnerClass {
        public void show1() {
            System.out.println("in a inner show");
        }
    }

    class InnerStaticMethod {
        public static void show2() {
            System.out.println("in a innerstaticMethod show");
        }

    }
    static class InnerStaticClass {
        public void show3() {
            System.out.println("in a innerstatic class show");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        OuterClass obj = new OuterClass();
        obj.show();
        OuterClass.InnerClass obj1 = obj.new InnerClass();//for a non static class
        obj1.show1();
        OuterClass.InnerStaticMethod.show2();//for a  static Method
        OuterClass.InnerStaticClass obj2 = new OuterClass.InnerStaticClass();//for a static class
        obj2.show3();
    }
}

