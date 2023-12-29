class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        char res='$';
        int n=S.length();
        int count[]=new int[26];
        for(int i=0;i<n;i++){
            count[S.charAt(i)-'a']++;
        }
        
        for(int i=n-1;i>=0;i--){
            if(count[S.charAt(i)-'a']==1){
                res=S.charAt(i);
            }
        }
        return res;
        //Your code here
    }
}
    }
}
