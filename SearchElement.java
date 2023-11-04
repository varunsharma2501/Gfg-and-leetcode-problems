

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        int high=N-1,low=0;
        while(low<=high){
        int mid=(high+low)/2;
            if(arr[mid]==K){
                return 1;
            }
            else if(K>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    return -1;
        // Your code here
        
    }
}
