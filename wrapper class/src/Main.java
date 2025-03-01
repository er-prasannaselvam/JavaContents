public class Main {
    public static void main(String[] args) {
        int x =10;
        Integer x1 =new Integer(x);
        System.out.println(x1.intValue());    //boxing

        //Auto-boxing
        int a =13;
        Integer a1 = a;
        System.out.println(a1.byteValue());

        //unboxing
        int b =x1.intValue();
        System.out.println(b-1);
        //Auto - unboxing
        int b1 =a1;
        System.out.println(b1+7);
        //Int parse (converting String to in teger)
        String str = "23";
        int Str1 = Integer.parseInt(str);
        System.out.println(Str1+2);
    }
}