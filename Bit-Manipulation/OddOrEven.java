public class FindSingleElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int n = 0;
        for(int i=0;i<nums.length;i++){
            n = n^nums[i];
        }
        System.out.println(n);
    }
}
