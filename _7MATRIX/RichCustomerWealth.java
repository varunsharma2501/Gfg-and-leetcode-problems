class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest=0;
        int vals[]=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int res=0;
            for(int j=0;j<accounts[i].length;j++){
                res+=accounts[i][j];
            }
            vals[i]=res;
            if(vals[largest]<vals[i]){
                largest=i;
            }
        }
        return vals[largest];
    }
}
