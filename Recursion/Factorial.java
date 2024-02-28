public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    static int factorial(int n){
        if(n<=2){
            return n;
        }
        return factorial(n-1)*n;

    }
}
