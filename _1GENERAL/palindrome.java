class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int num=x;
        int rev=0;
        while(num!=0){
            int temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
