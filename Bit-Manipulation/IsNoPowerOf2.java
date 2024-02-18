public class IsPowerOf2 {
    public static void main(String[] args) {
       // The question is to check whether a number is perfect square or not
        int n = 19;
        int a = n & (n-1);
        if(a==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
