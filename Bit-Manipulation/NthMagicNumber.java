public class NthMagicNumber {
    public static void main(String[] args) {
        System.out.println(check(6));
    }
    public static double check (int n){
        double sum = 0;
        int i = 1;
        while(n>0){
            int a = n & 1;
            double b = Math.pow(5,i);
            sum = sum + a*b;
            i++;
            n=n>>1;
        }
        return sum;
    }
}
