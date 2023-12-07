
//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
       
       for(int i=0;i<n-1;i+=k){
        int left=i;
        int right=i+k-1;
        if(right>n-1){
            right=n-1;
        }
        
        while(left<right){
            // int temp=arr[left];
            // arr[left]=arr[right];
            // arr[right]=arr[temp];
            int temp=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            
            // collections.swap(arr,left,right);
            
            // swap(left,right);
            left++;
            right--;
        }
       }
        // code here
    }
}
