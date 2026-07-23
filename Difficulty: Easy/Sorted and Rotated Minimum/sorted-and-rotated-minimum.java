class Solution {
    public int findMin(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length-1;
        int ans = arr[0];
        
        while(left < right){
            
            int mid = left + (right - left)/2;
            
            if (arr[right] < arr[mid]){
                left = mid+1;
            } else {
                right = mid;
            }
        }
        
        return arr[left];
    }
}
