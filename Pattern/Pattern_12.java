/* 12.  * * * * *
         * * * *
          * * *
           * *
            *
            *
           * *
          * * *
         * * * *
        * * * * *   */
public class Pattern_12 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int c = 1;
        for (int i = 1; i <=2*n ; i++) {
            if(i<=n){
                for (int j = 1; j <i ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <=n-i+1 ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{

                for (int j = 1; j <=n-c ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <=c ; k++) {
                    System.out.print("* ");
                }
                c++;
                System.out.println();

            }
        }
    }

}
