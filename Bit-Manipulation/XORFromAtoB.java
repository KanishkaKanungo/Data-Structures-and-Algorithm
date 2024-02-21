public class XORFromAtoB {
    public static void main(String[] args) {
        int a = 3,b=9;
        int n = check(3);
        int m = check(9);
        int p = n ^ m;
        System.out.println(p);

    }
    public static int check(int a){
        if(a%4==0){
            return a;
        } else if (a%4==1) {
            return 1;
        } else if (a%4==2) {
            return a+1;
        } else if (a%4==3) {
            return 0;
        }
        return -1;
    }
}
