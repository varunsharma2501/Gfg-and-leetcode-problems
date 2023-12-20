class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(prices[i]<min1){
                min2=min1;
                min1=prices[i];
            }
            else if(prices[i]<min2){
                min2=prices[i];
            }
        }

        return (min1+min2 <=money) ?money-(min1+min2):money;
    }
}
