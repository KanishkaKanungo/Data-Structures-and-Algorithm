public class ReverseNumber {

    // METHOD 1 : Using global variable, only n/10 is recursed
    static int sum = 0;
    static void reverse1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse1(n/10);
    }

    // METHOD 2 : Using helper function, without global variable

    static int reverse2(int n){
        int digits = (int)Math.log10(n) +1;
        return helper(n,digits);
    }

    static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
    }

}
