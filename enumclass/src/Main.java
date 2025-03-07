enum Soaps{
    cinthol(45,"ct"),dettol,hamam(40,"hm"),dove(55,"dv");
     private int prize;
     private String name;
     private Soaps(){
          prize = 0;
     }
     private Soaps (int thisPrize,String thisName){
        name = thisName;
        prize = thisPrize;
         System.out.println("this is "+thisName);
    }
//    //using "This" keywords to creating constructors
//    Soaps (int prize,String name){
//        this.prize = prize;
//        this.name = name;
//    }

    public String getName() {   //creating this for because prize,name are private
        return name;
    }

    public void setName(String name) {
        this.name = name;     //setters to change the values anytime
    }

    public int getPrize() {   //using getPrize you can access prize variable
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
public class Main {
    public static void main(String[] args){
          Soaps[] sp = Soaps.values();
          for (Soaps gp:sp){ //Soaps is a type,gp is a var.name,sp is ref.var
              System.out.println(gp+" : "+gp.getPrize());
          }
//          for (Soaps sap : Soaps.values()){
//              System.out.println(sap+" : "+sap.getPrize());
//          }
    }
}