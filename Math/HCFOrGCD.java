public class HCFOrGCD{
  public static void main(String[] args){
   System.out.println(check(105,224));
  }
  static int check(int a,int b){
    if(a==0){ 
      return b;
     }
    return check(b%a,a);
  }
}
