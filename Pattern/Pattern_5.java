import java.util.Scanner;

/*5.    *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
        * */
public class Pattern_5 {
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int c = 0;
        for (int i = 1; i <2*n ; i++) {
            if(i<=n){
               c=i;
            }else{
                c= 2*n-i;
            }
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
