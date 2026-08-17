class Solution:
    def uniquePerms(self, arr):
        # code here 
        
        arr.sort()
        ans = []
        used = [False] * len(arr)
        self.uniquePermute(arr, ans, [], used)
        
        return ans
        
    def uniquePermute(self, arr, result, curr, used):
        
        if len(curr) == len(arr):
            result.append(curr.copy())
            return
        
        for i in range(len(arr)):
            if used[i]:
                continue
            
            if i>0 and arr[i] == arr[i-1] and not used[i-1]:
                continue
            
            used[i] = True
            curr.append(arr[i])
            
            self.uniquePermute(arr, result, curr, used)
            
            curr.pop()
            
            used[i] = False
            
            