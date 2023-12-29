class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
        int n=s.length();
        int m=x.length();
        
        for(int i=0;i<=n-m;i++){
            boolean flag=true;
            for(int j=0;j<m;j++){
                if(s.charAt(i+j)!=x.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
       // Your code here
    }
}
