/*13.     *
         * *
        *   *
       *     *
      *********  */
public class Pattern_13 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int c =0;
        for (int i = 1; i <=n ; i++) {
            for(int l = 1;l<=n-i;l++){
                System.out.print(" ");
            }
            if(i!=n) {

                    System.out.print("*");
                    if (i > 1) {
                        for (int k = 1; k <= i+c-2; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                System.out.println();
                c++;
                }


            else {
                for (int j = 1; j <=i+c ; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}
