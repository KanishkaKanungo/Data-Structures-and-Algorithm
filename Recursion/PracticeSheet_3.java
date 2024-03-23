/*Q.02
        #include<stdio.h>
        void show(int n)
        {
        if(n<=0)return;
        printf("%d\n",n);
        show(n-2);
        show(n-4);
        }
        void main()
        {
        show(10);
        }
        solution : 10 8 6 4 2 2 4 2 6 4 2 2 
        */
public class PracticeSheet_3 {
    public static void main(String[] args) {
        show(10);
    }
    static void show(int n){
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        show(n-2);
        show(n-4);
    }
}
