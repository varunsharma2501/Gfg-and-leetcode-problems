class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int l=0;
        int sl=0;
        int sm=Integer.MAX_VALUE;
        int ssm=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
           if(nums[i]>l){
               sl=l;
               l=nums[i];
           }
           else if(nums[i]>sl){
               sl=nums[i];
           }

           if(nums[i]<sm){
               ssm=sm;
               sm=nums[i];
           }
           else if(nums[i]<ssm){
               ssm=nums[i];
           }
        }

        return l*sl-sm*ssm;
    }
}
