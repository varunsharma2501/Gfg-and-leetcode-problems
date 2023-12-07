

// User function template for Java
class Solution
{
    static int betBalance(String result)
    {
        int sum=4;
        int bet=1;
        for(int i=0;i<result.length();i++){
            if(sum<bet){
                return -1;
            }
            if(result.charAt(i)=='W'){
                sum+=bet;
                bet=1;
            }
            else{
                sum-=bet;
                bet=bet*2;
            }
        }
        
        return sum;
        // code here
    }
}
