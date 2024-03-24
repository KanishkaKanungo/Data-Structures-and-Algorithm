import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {33,15,1,-18,19};
        sort(nums,nums.length-1,1);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums, int i,int j){
        if(i==0){
            return;
        }
        if(i>=j){
            if(nums[j-1]>nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1]  = temp;
            }
            sort(nums,i,j+1);
        }
        else{
            sort(nums,i-1,1);
        }
    }
}
