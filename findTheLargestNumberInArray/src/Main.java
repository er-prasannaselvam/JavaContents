public class Main {
    public static void main(String[] args) {
        int[] num = {15,25,78,57,88};
        int x = -1;
        for (int j =0;j<num.length;j++){
            if (x <= num[j]){
                x = num[j];
            }
        }
        System.out.println("The largest number in a array is:"+x);
    }
}