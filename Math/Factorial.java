class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        for(int i=1 ; i<=n;i++){
            long ans = factorial(i);
            if(ans <=n){
                list.add(ans);
            }else{
                break;
            }
        }
        return list;
        
    }
    static long factorial(long n){
        if(n<2){
            return n;
        }
        return factorial(n-1) * n;
    }
}