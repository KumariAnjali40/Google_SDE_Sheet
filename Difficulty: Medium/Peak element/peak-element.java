class Solution {
    public int peakElement(int[] arr) {

        int n = arr.length;

        // if (n == 1)
        //     return 0;

        // if (arr[0] > arr[1])
        //     return 0;

        // if (arr[n - 1] > arr[n - 2])
        //     return n - 1;
        
        // for(int i = 1; i < arr.length-1; i++){
        //     if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
        //         return i;
        //     }
        // }
        
        // return 0;
        
        if (n == 1) 
        return 0;
        
        if (arr[0] > arr[1])
        return 0;
        
        if (arr[n - 1] > arr[n - 2])
        return n - 1;
    
        
        int left = 1;
        int right = arr.length-2;
        
        
        while(left <= right){
            
            int mid = left + (right-left)/2;
            
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            } else if(arr[mid] < arr[mid+1]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        
        return 0;
    }
}
