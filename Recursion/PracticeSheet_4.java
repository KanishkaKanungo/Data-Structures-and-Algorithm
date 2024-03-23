/*Q.02
        #include<stdio.h>
        void show(int n)
        {
        if(n<1)return;
        printf("%d\n",n);
        show(n-2);
        show(n-3);
        }
        void main()
        {
        show(12);
        }
        solution : 10 8 6 4 2 2 4 2 6 4 2 2
        */
public class PracticeSheet_4 {
    public static void main(String[] args) {
        show(12);
    }
    static void show(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        show(n-2);
        show(n-3);
    }
}
