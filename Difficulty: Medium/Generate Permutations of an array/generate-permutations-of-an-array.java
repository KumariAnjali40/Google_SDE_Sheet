class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        boolean [] used = new boolean [arr.length];
        
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        
        permute(arr, list, used, new ArrayList<>());
        
        return list;
    }
    
    public static void permute(int [] arr, ArrayList<ArrayList<Integer>>list, boolean [] used, ArrayList<Integer>curr){
        
        if(curr.size() == arr.length){
            list.add(new ArrayList<>(curr));
            
            return;
        }
        
        for(int i = 0; i < arr.length; i++){
            
            if(used[i]) continue;
            
            curr.add(arr[i]);
            used[i] = true;
            
            permute(arr, list, used, curr);
            
            curr.remove(curr.size()-1);
            
            used[i] = false;
        }
    }
};