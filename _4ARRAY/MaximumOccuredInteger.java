// L[] and R[] are input ranges
// n : size of array
// maxx: maximum element in R[]
// arr[]: declared globally with size equal to 1000000

class Solution{
    //Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int arr_freq[]=new int[maxx+5];
        for(int i=0;i<n;i++){
            int l=L[i];
            int r=R[i];
            
            arr_freq[l]+=1;
            arr_freq[r+1]-=1;
        }        
        int count=0;
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<=maxx;i++){
            count+=arr_freq[i];
            if(count>max){
                ind=i;
                max=count;
            }
        }
        return ind;
    }
    
}
