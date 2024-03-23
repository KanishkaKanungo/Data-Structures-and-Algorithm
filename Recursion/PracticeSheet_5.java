
/* Q.05
        #include<stdio.h>
        void show(int n)
        {
        if(n<=0)return;
        show(n-1);
        printf("%d\n",n);
        show(n-3);
        }
        void main()
        {
        show(7);
        }*/
 public class PracticeSheet_5 {
    public static void main(String[] args) {
        show(7);
    }
    static void show(int n){
        if(n<=0){
            return;
        }
        show(n-1);
        System.out.print(n+" ");
        show(n-3);
    }
}
