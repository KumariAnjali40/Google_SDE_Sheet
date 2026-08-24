class Solution:
    def findEquilibrium(self, arr):
        # code here
        prefix = len(arr) * [0]
        prefix[0] = arr[0]
        
        for i in range(1,len(arr)):
            prefix[i] = arr[i] + prefix[i-1]
            
            # prefix = [1,3,3,3 ]
            
            
            
        for i in range(1,len(arr)):
            lastPrefix = prefix[len(arr)-1]
            right = lastPrefix - prefix[i]
            if prefix[i-1] == right:
                return i
                
                
    
        return -1

