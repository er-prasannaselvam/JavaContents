class mobileAccessories {
    String headPhone;
    int headPhonePrice;
    public String toString(){
        String result=(headPhone+" : "+headPhonePrice);
        return result;
    }
    public boolean equals(mobileAccessories object){
        if (this.headPhonePrice==object.headPhonePrice){
            return true;
        }
        return false;
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        mobileAccessories mob = new mobileAccessories();
        mobileAccessories mob1 = new mobileAccessories();
        mob.headPhone="redmi";
        mob.headPhonePrice=2500;
        mob1.headPhone="redmi";
        mob1.headPhonePrice=2500;
        System.out.println(mob.equals(mob1));
        System.out.println(mob.headPhonePrice);
        System.out.println(mob);
    }
}
