class Solution
{
    //Function to find repeated character whose first appearance is leftmost.
    static int repeatedCharacter(String S)
    {
        boolean count[]=new boolean[256];
        int n=S.length();
        int res=-1;
        for(int i=n-1;i>=0;i--){
            if(count[S.charAt(i)]==true){
                res=i;
            }
            else{
                count[S.charAt(i)]=true;
            }
        }
        return res;
        // add your code here
    }
}
