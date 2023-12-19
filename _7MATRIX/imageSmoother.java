class Solution {
    public int[][] imageSmoother(int[][] img) {
        int r=img.length;
        int c=img[0].length;
        int ans[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int sum=0;int count=0;
                for(int x=i-1;x<=i+1;x++){
                    for(int y=j-1;y<=j+1;y++){
                        if((x>=0 && x<r) && (y>=0 && y<c)){
                            sum+=img[x][y];
                            count++;
                        }
                    }
                }
                ans[i][j]=(int)sum/count;   
            }
        }
        return ans;
    }
}
