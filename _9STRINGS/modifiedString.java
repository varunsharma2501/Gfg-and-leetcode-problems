class Solution
{
    //Function to find minimum number of characters which Ishaan must insert  
    //such that string doesn't have three consecutive same characters.
    public static long modified(String a)
    {
        int n=a.length();
        int count=1;
        int res=0;
        for(int i=1;i<n;i++){
            if(a.charAt(i)==a.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            
            if(count!=1 && count%2==1){
                res++;
            }
        }
        return res;
        
        // Your code here
    }
}
