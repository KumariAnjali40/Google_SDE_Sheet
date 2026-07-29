class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int D) {
        // code here
        int maxDays = Collections.max(arr);
        int n = arr.size();
        
        // int i = 0;
        
        // while(true){
            
        //     if(findMinCapacity(arr,i, maxDays,D, n )){
        //         return maxDays;
        //     }
            
        //     maxDays++;
            
        // }
        
       int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < arr.size(); i++){
            low = Math.max(arr.get(i), low);
            high += arr.get(i);
        }
  
    
        int ans = high;
        
        while(low <= high){
            int mid = (high + low)/2;
            
            if(findMinCapacity(arr, mid, D )){
                ans = mid;
                
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return ans;
        
    }
    
    public static boolean findMinCapacity(ArrayList<Integer> list,int minCap, int days){
        
        // int currSum = 0;
        // int currCount = 0;
        
        // for(int i = index; i < n; i++){
            
        //     currSum += list.get(i);
            
        //     if(currSum >= minCap){
        //         if(currSum == minCap){
        //             currSum = 0;
        //         }
                
        //         if(currSum > minCap){
        //             currSum = list.get(i);
        //         }
                
        //         currCount++;
        //     }
            
        //     if(n - i == days - currCount){
        //         return true;
        //     }
        // }
        
        // if(currSum != 0){
        //     currCount++;
        // }
        
        
        
        // return currCount == days;
        
        int day = 1;
        int currSum = 0;
        
        for(int weight : list){
           
            
            if(currSum + weight <= minCap){
                currSum += weight;
            } else {
                day++;
                currSum = weight;
            }

        }
        
        return day <= days;
    }
}