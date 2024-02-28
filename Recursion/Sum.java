public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(14));
    }
    static int sum(int n){
        if(n<=1){
            return n;
        }
        return sum(n-1)+n;

    }
}
