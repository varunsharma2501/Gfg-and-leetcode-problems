class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int count[]=new int[26];
        int n=a.length();
        if(a.length()!=b.length()){
            return false;
        }
        
        for(int i=0;i<n;i++){
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }
        // Your code here
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
        
    }
}
