/*11.  * * * * *
        * * * *
         * * *
          * *
           *
        */

public class Pattern_11 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n-i+1 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
