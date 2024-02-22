public class NewtonRaphsonMethodSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
        //System.out.println(40);
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x + n/x);
            if(x - root < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
