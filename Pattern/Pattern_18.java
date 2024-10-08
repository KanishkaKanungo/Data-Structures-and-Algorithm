/*
1
2 3
4 5 6
7 8 9 10
*/

public class Pattern_18 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int c =1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
