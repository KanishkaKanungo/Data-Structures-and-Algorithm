/*10.      *
          * *
         * * *
        * * * *
       * * * * *   */

public class Pattern_10 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int c = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
