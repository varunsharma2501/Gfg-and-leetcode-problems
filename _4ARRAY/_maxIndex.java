



class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        int leftMin[]=new int[N];
        int rightMax[]=new int[N];

        leftMin[0]=A[0];
        for(int i=1;i<N;i++){
            leftMin[i]=Math.min(leftMin[i-1], A[i]);
        }

        rightMax[N-1]=A[N-1];
        for(int i=N-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], A[i]);
        }

        int i=0,j=0,ans=-1;
        while(i<N & j<N){
           if(leftMin[i]>rightMax[j]){
            i++;
            // invalid case
           } 
           else{
            ans=Math.max(ans,j-i);
            j++;
           }
        }
        return ans;
        
    }
}





