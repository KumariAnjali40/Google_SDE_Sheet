class Solution {
    public void sortInWave(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        if(arr.length % 2 == 0){
            for(int i = 0; i < arr.length; i+=2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        } 
        
        if(arr.length %2 !=0){
            for(int i = 0; i < arr.length; i+=2){
                if(i != arr.length - 1){
                     int temp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = temp;
                }
            }
            
        }
        
    }
}
