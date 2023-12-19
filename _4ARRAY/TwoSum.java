class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int comple=target-nums[i];
            if(map.containsKey(comple)){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
