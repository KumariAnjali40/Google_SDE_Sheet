class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = 0;
        int max = arr[0];
        
        if(arr.length == 1){
            return arr[0];
        }
        
        for(int i = 0; i < arr.length; i++){
            
            sum += arr[i];
            
            max = Math.max(max, sum);
            
            if(sum < 0){
                sum = 0;
            }
            
        }
        
        return max;
    }
}
