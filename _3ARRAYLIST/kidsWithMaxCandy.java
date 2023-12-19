class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ls=new ArrayList<>();
        int maxval=max(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxval){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
        return ls;
    }
    public static int max(int arr[]){
        int largest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                largest=i;
            }
        }
        return arr[largest];
    }
}
