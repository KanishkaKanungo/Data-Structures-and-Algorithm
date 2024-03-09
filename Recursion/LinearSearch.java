import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,6};
        System.out.println(search1(arr,5,0));
        System.out.println(search(arr,5,0));
        search2(arr,6,0);
        System.out.println(list);
    }
    static boolean search(int[] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target || search(arr,target,i+1);
    }
    static int search1(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i+1;
        }
        return search1(arr,target,i+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void search2(int[] arr,int target,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            list.add(i+1);
        }
        search2(arr,target,i+1);
    }
}
