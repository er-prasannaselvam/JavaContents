class Numberss{
    int a;
    int b;
    public boolean equals(Numberss n12){
        boolean result =(this.a == n12.a);
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Numberss n1 =new Numberss();
        n1.a=1;
        Numberss n2 =new Numberss();
        n2.a=1;
        System.out.println(n1.equals(n2));
    }
}