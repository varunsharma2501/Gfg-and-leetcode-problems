class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {   int count=0;
        int mul=0;
        for(int i=0;i<a;i++){
            if(str.charAt(i)=='1'){
                count+=mul;
                mul++;
            }
        }
        return count;
        // Your code here
    }
}
