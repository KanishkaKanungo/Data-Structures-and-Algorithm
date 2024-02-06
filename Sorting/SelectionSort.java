import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,76,34,56,-1,90};
        System.out.println(Arrays.toString(selection(arr)));
    }
    static int maxPosition(int[] arr, int start, int last){
        int max=0;
        for (int i = start+1; i <=last; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static int[] selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int maxValue = maxPosition(arr,0,last);
            int temp = arr[maxValue];
            arr[maxValue] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }
}
