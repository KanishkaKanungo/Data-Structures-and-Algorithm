public class ProductOfDigits {
    public static void main(String[] args) {
        trial(5);
    }
    static int product(int n){
        if(n<=1){
            return n;
        }

        return (n%10) * product(n/10);
    }
    static void trial(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        trial(--n); // post decrement wont work - will lead to infinite loop
    }
}
