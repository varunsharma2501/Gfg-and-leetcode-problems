class Solution
{
    //Function to check if a string is subsequence of other string.
    public static boolean isSubSequence(String A, String B)
    {
        int n=B.length();
        int m=A.length();
        int j=0;
        for(int i=0;i<n;i++){
            if(j>=m){
                break;
            }
            if(A.charAt(j)==B.charAt(i)){
                j++;
            }
        }
        if(j==A.length()){
            return true;
        }
        else{
            return false;
        }
        //code here
    }
};
