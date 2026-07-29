class Solution {
    public int countOccurence(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int req = n/k;
        
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key) > req){
                count++;
            }
        }
        
        return count;
    }
}