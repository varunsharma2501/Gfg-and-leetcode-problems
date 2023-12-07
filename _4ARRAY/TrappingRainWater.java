

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        int left=0;
        int right=n-1;
        
        long leftmax=(long)arr[0];
        long rightmax=(long)arr[n-1];
        long ans=0;
        
        while(left<=right){
            
            if(leftmax<=rightmax){
                if((long)arr[left]>leftmax){
                    leftmax=(long)arr[left];
                }
                else{
                    ans+=leftmax-(long)arr[left];
                    left++;
                }
            }
            else{
                if((long)arr[right]>rightmax){
                    rightmax=(long)arr[right];
                }
                else{
                    ans+=rightmax-(long)arr[right];
                    right--;
                }
            }
        }
        return ans;
        // Your code here
    } 
}
