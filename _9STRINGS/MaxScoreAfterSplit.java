class Solution {
    public int maxScore(String s) {
        int res=0;
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        int zeroes=0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeroes++;
            }
            else{
                ones--;
            }
            res=Math.max(res,zeroes+ones);
        }
        return res;
    }
}
