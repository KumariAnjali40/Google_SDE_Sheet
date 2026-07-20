
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left = 0;
        
        int sum = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int right = 0; right < arr.length; right++){
            
            sum += arr[right];
            
            while(sum > target && left <= right){
                 sum -= arr[left];
                 
                 left++;
            }
            
            if(sum == target){
                list.add(left+1);
                list.add(right+1);
                
                return list;
            }
        }
        
        list.add(-1);
        
        return list;
    }
}
