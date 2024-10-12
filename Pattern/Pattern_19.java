/*
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G
*/
public class Pattern_19 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
}
