import java.util.ArrayList;

public class LinearSearch_ArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,6};
        ArrayList<Integer> list = new ArrayList<>();  
        System.out.println(search1(arr,6,0));
    }
    static ArrayList<Integer> search(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i+1);
        }
        return search(arr,target,i+1,list);
    }
    static ArrayList<Integer> search1(int[] arr,int target,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ans = search1(arr,target,i+1);
        list.addAll(ans);
        return list;
    }
}
