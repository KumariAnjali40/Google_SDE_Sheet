class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];
        int [] pre = new int [n];
        int [] suf = new int [n];

        pre[0] = 1;
        suf[n-1]= 1;

        for(int i = 1; i < nums.length; i++){
             pre[i] = pre[i-1] * nums[i-1];
        }

        for(int i = nums.length-2; i >=0; i--){
            suf[i] = suf[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++){
            arr[i] = pre[i] * suf[i];
        }

        return arr;
    }
}