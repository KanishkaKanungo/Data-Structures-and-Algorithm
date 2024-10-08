/*
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1 */
public class Pattern_17 {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*n-2*i;k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
