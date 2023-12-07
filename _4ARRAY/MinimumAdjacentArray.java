
class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        int min_diff=Math.abs(arr[0]-arr[n-1]);
        
        // Your code here
        for(int i=1;i<n;i++){
        int diff=Math.abs(arr[i]-arr[i-1]);
        min_diff=Math.min(diff,min_diff);
        }
        
        return min_diff;
    }
}
