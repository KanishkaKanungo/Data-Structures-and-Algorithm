public class NoOnetoN {
    public static void main(String[] args) {
print2(5);
    }
    static void print(int n){
        if(n<=0){
            return;
        }
        print(n-1);
        System.out.print(n + " ");
//        System.out.println(46546);
//        System.out.println(533);
    }
    // print n-1 then 1-n
    static void print2(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        print2(n-1);
        System.out.println(n);
    }
}
