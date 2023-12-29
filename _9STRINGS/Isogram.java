class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        int n=data.length();
        boolean count[]=new boolean[26];
        
        for(int i=0;i<n;i++){
            if(count[data.charAt(i)-'a']==true){
                return false;
            }
            else{
                count[data.charAt(i)-'a']=true;
            }
        }
        return true;
        //Your code here
    }
}
