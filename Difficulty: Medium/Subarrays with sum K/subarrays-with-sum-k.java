class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        // int ans = 0;
        // for(int i = 0; i < arr.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < arr.length; j++){
        //         sum += arr[j];
                
        //         if(sum == k){
        //             ans += 1;
        //         }
        //     }
        // }
        
        // return ans;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int count = 0;
         map.put(0, 1);
        
        for(int num: arr){
            
            sum += num;
            
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        
        
        return count;
        
      
        
        
    }
}