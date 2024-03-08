/*Q.01
        #include<stdio.h>
        void show(int n)
        {
        if(n<=0)return;
        printf("%d\n",n);
        show(n-1);
        show(n-4);
        }
        void main()
        {
        show(9);
        }*/
public class PracticeSheet_2 {
    public static void main(String[] args) {
        show(9);
    }
    static void show(int n){
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        show(n-1);
        show(n-4);
    }
}
