/*9.  *********
       *******
        *****
         ***
          *
        */


public class Pattern_9 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int c = 1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for(int j = 1;j<=2*n - c;j++){
                System.out.print("*");
            }
            c = c+2;
            System.out.println();
        }
    }
}
