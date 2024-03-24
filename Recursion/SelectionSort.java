import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {13,2,4,-9,-18};
sorting(nums,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static int maxElement(int[] nums, int start,int last,int max){
        if(start>last){
            return max;
        }

            if(nums[start]>nums[max]) {
                max = start;
            }

        return maxElement(nums,start+1,last,max) ;

    }
    static void sorting(int[] nums,int last){
        if(last==0){
            return;
        }
        var a = maxElement(nums,0,last,1);
        int temp = nums[a];
        nums[a] = nums[last];
        nums[last] = temp;
        sorting(nums,last-1);
    }
}
