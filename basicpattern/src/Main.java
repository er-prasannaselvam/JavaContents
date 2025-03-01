import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int base = 4; base >= 1; base--) {
//            for (int sill = 1; sill <= base; sill++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int endRow;
//        System.out.println("enter the endrow value:");
//        Scanner input = new Scanner(System.in);
//        endRow = input.nextInt();
//        for (int row = 1; row <= endRow; row++) {
//            for (int space =1;space<=row;space++){
//                System.out.print(" ");
//            }
//            for (int col=row; col <= endRow; col++) {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
        System.out.println("diamond pattern");
            for (int row =1;row<=5;row++){
                for(int space =4;space>=row;space--){
                    System.out.print(" ");
                }
                for (int col= 1;col<=row;col++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            for (int downrow=4;downrow>=1;downrow--){
                for (int downspace=4;downspace>=downrow;downspace--){
                    System.out.print(" ");
                }
                for (int downcolumn=1;downcolumn<=downrow;downcolumn++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
    }
}



