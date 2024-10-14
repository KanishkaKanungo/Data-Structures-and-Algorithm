class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i]) && arr[i]<=N){
                hash.put(arr[i], hash.get(arr[i])+1);
            }else if(!hash.containsKey(arr[i]) && arr[i]>N){
                continue;
            }else{
                hash.put(arr[i],1);
            }
        }
        int[] arr1  =new int[arr.length];
        for(int j=0;j<arr.length;j++){
            if(hash.containsKey(arr[j])){
                int a = hash.get(arr[j]);
                arr1[arr[j]-1] = a;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr1[i];
        }
    }
}