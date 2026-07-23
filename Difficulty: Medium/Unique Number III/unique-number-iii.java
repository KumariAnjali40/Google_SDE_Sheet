class Solution {
    public int getSingle(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            // if(map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            // }else{
            //     map.put(arr[i], 1);
            // }
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        
        return -1;
    }
}