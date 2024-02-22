public class SquareRoot {
    public static void main(String[] args) {
        int n =40;
        var a  = search(40,0,40);
        if(a*a!=n){
            var b = preciseCheck(40,a);
            System.out.println(b);
        }
    }
    static int search(int n,int start,int end){
        double root = 0.0;
       while(end>=start) {
           int mid = start + (end - start) / 2;
           if (mid * mid == n) {
               return mid;
           } else if (mid * mid > n) {
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
        return end;
    }
    static double preciseCheck(int n,int check_n){
         double VALUE = 0.1;
        double NewCheck = (double) check_n;
        for (int i = 0; i < 3; i++) {
            while (NewCheck * NewCheck <= n) {
                NewCheck = NewCheck + 0.1;
            }
            NewCheck = NewCheck-VALUE;
            VALUE/=10;
        }
        return NewCheck;
    }
}
