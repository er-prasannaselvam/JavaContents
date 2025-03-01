public class Main {
    public static void main(String[] args) {

        for (int n = 1; n <= 5; n++) {
            for (int k = 2;k<=n+n; k++) {
                if (k%2==0 ) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }}


