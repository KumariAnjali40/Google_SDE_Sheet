class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        
        int i = n-1;
        
        while(i > 0 && arr[i-1] >= arr[i]){
            i--;
        }
        
         int j = n-1;
        
        if(i > 0){
            
            while(arr[j] <= arr[i-1]){
                j--;
            }
            
            swap(arr, i-1, j);
            
        }
        
        reverse(arr, i, n-1);
    }
    
    public static void reverse(int [] arr, int left, int right){
        
        while(left <= right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    
    public static void swap(int [] arr, int left, int right){
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
    }
}