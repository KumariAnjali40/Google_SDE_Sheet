class Solution:
    def targetSumComb(self, arr: list[int], target: int) -> list[list[int]]:
        # code here
        result = []
        
        self.dfs(arr, target, 0, result, [])
        
        return result
        
        
    def dfs(self, arr, target, index, result, curr):
        
        if target == 0:
            result.append(curr.copy())
            return
        
        if target < 0 or index == len(arr):
            return
        
        # take
        curr.append(arr[index])
        self.dfs(arr, target - arr[index], index, result, curr)
        
        # not take
        
        curr.pop()
        self.dfs(arr, target, index+1, result, curr)