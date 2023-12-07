

//User function Template for Java

class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       if(N%2!=0){
           int ind=(0+(N-1))/2;
           return A[ind];
       }
       else{
           int ind=(N-1)/2;
           
           return (A[ind]+A[ind+1])/2; 
       }
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        return sum/N;
       //Your code here
    }

}
