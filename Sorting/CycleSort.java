import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {7,4,3,1,2,5,6};
        System.out.println(Arrays.toString(cycle(arr)));
        int[] a = new int[4];
    }
    static int[] cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int index = arr[i]-1;
            if(index!=i){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index] = temp;
            }else {
                i++;
            }
        }
        return arr;
    }
}
