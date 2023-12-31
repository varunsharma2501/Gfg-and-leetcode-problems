class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        String res="";
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n2;i++){
            map.put(s2.charAt(i),1);
        }
        
        for(int i=0;i<n1;i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),2);
            }
            else{
                res+=s1.charAt(i);
            }
        }
        
        for(int i=0;i<n2;i++){
            if(map.get(s2.charAt(i))==1){
                res+=s2.charAt(i);
            }
        }
        
        if(res==""){
            res="-1";
        }
        
        return res;
        // Your code here
    }
}
