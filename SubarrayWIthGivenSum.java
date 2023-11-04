

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ls=new ArrayList<Integer>();
        if(s==0){
            ls.add(-1);
            return ls;
        }
        
        int left=0;
        int right=0;
        int sum=0;
        
        while(right<n){
            sum+=arr[right];
            
            if(sum>s){
                while(sum>s  && left<right){
                    sum-=arr[left];
                    left++;
                }
            }
            
            if(sum==s){
                ls.add(left+1);
                ls.add(right+1);
                return ls;
            }
            
            
            right++;
        }
        ls.add(-1);
        return ls;
        // Your code here
    }
}
