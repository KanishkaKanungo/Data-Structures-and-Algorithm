import java.util.Arrays;

public class QuickSort_Pivot_End {
    public static void main(String[] args) {
        int[] nums = {10,80,30,90,40,50,70};
        sort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int pivot = nums[end];
        while(start<end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            // here the condition start <= end my violate hence it is checked once again
            if(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
//                start++;
//                end--;
        }
        sort(nums,low,end-1);
        sort(nums,start+1,high);
    }
}
