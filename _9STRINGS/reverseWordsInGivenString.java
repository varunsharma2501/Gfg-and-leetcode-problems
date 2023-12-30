class Solution 
{
    //Function to reverse words in a given string.
   public static String reverseWords(String S)
    {
        StringBuilder S1=new StringBuilder(S);
        int n=S1.length();
        int start=0;
        for(int i=0;i<n;i++){
            if(S1.charAt(i)=='.'){
                reverse(S1,start,i-1);
                start=i+1;
            }
        }
        reverse(S1,start,n-1);
        
        reverse(S1,0,n-1);
        String res=S1.toString();
        return res;
        // code here 
    }
    
    public static void reverse(StringBuilder str,int i,int j){
       while(i<=j){
           char temp=str.charAt(i);
           str.setCharAt(i,str.charAt(j));
           str.setCharAt(j,temp);
           i++;
           j--;
       } 
    }
}
