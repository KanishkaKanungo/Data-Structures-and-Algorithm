// MATH PROBLEM

// ANOTHER METHOD TO FIND PRIME NUMBER WITHIN A RANGE
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean[] arr = new boolean[n+1]; // MAKE ARRAY OF SIZE 1 EXTRA AS WE HAVE TO CHECK NO N AS WELL
                                          // AND WE ARE CONSIDERING THE INDEX OF ARRAY AS THE NUMBER WITHIN THE RANGE
        primeNo(40,arr);
    }
    static void primeNo(int n, boolean[] arr){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!arr[i]){
                for (int j = i*i; j <=n ; j=j+i) {
                    arr[j] = true;
                }
            }
        }
        for (int k = 2; k <=n; k++) {
            if(!arr[k]){
                System.out.println(k);
            }
        }
    }
}
