class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
      
        boolean[] count=new boolean[256];
        
        for(int i=0;i<patt.length();i++){
            count[patt.charAt(i)]=true;
        }
        
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==true){
                return i;
            }
        }
        return -1;
        // Your code here
    }
}
