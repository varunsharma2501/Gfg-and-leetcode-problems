

class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        
        int l=arr.length;
        if(l==1){
            return ;
        }
        int rp=l-1;
        int lp=0;
        int max=(int)(arr[l-1]+1);
        
        for(int i=0;i<l;i=i+2){
            arr[i]=arr[i]+(max)*(arr[rp]%max);
            rp--;
        }
        for(int i=1;i<l;i=i+2){
            arr[i]=arr[i]+(max)*(arr[lp]%max);
            lp++;
        }
        
        for(int i=0;i<l;i++){
            arr[i]=arr[i]/max;
        }
        // Your code here
        
    }
    
}


