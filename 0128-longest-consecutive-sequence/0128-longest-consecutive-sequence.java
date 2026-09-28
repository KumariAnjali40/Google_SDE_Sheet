class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int max = 0;

        for(int num : set){
            int currCount = 0;
            if(!set.contains(num-1)){
               
               while(set.contains(num)){
                 currCount += 1;
                 num += 1;
               }

            }

            max = Math.max(currCount, max);
        }

        return max;

        
    }
}