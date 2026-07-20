


class Solution {
    int majorityElement(int arr[]) {
        // code here
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // for(int i = 0; i < arr.length; i++){
        //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        // }
        
        // for(int i = 0; i < arr.length; i++){
        //     if(map.containsKey(arr[i]) && map.get(arr[i]) > arr.length/2){
        //         return arr[i];
        //     }
        // }
        
        // return -1;
        
        if(arr.length == 2 && arr[0] != arr[1]){
          return -1;
        }
        
        int count = 0;
        int candidate = -1;
        
        for(int i = 0; i < arr.length; i++){
            
            if(count == 0){
                candidate = arr[i];
            }
            
            if(candidate == arr[i]){
                count++;
            }else {
                count--;
            }
        }
        
        int ans = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == candidate){
                ans++;
            }
        }
        
        return ans > arr.length/2 ? candidate : -1;
    }
}
