class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
        int n=txt.length();
        int m=pat.length();
        
        for(int i=0;i<n-m+1;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
            }
            
            if(j==m){
                return true;
            }
        }
        return false;
            // Your code here
    }
    
}
