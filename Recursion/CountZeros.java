public class CountZeros {
    static int count = 0;
    static void count(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        if(rem==0){
            count = count + 1;
        }
         count(n/10);
    }
    static int count2(int n,int counter){
      if(n==0){
          return counter;
      }
      if(n%10==0){
          return count2(n/10,counter+1);
      }
      return count2(n/10,counter);

    }

    public static void main(String[] args) {
        int count1 =0;
        System.out.println(count2(20004010,count1));
    }
}
