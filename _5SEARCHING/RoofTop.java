class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        int steps=0;
        int res=0;
        for(int i=1;i<N;i++){
            if(A[i]>A[i-1]){
              steps++;
            }
            else{
                steps=0;
            }
            
                res=Math.max(res,steps);
        }
        return res;
        // Your code here
    }
    
}
