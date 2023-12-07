

class LeftIndex{ 

    static int leftIndex(int N, int arr[], int X)
    {
        int low=0,high=N-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(X>arr[mid]){
                low=mid+1;
            }
            else if(X<arr[mid]){
                high=mid-1;
            }
            else{
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
       // Your code here
       
   
    }
}
