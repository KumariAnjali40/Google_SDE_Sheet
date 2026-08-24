class Solution:
    def rangeSumQueries(self, arr, queries):
        # code here
        prefix = [0] * len(arr)
        
        prefix[0] = arr[0]
        
        for i in range(1,len(arr)):
            prefix[i] = prefix[i-1] + arr[i]
            
            
        ans = []
        
        for i in range(len(queries)):
            left = queries[i][0]
            right = queries[i][1]
            
            if left == 0:
                total = prefix[right]
                
            else:
                total = prefix[right] - prefix[left-1]
                
                
            ans.append(total)
            
        return ans
        
        
        