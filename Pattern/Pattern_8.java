/*8.      *
         ***
        *****
       *******
      *********  */
public class Pattern_8 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int c = 0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            for(int j = 1;j<=i+c;j++){
                System.out.print("*");
            }
            c++;
            System.out.println();
        }
    }
}
