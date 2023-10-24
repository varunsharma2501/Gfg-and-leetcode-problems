class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       int occ=(int)n/k;
       int res=0;
       
        for(int i=0;i<n;i++){
            int count=map.containsKey(arr[i])?map.get(arr[i]):0;
            map.put(arr[i],count+1);
        }
        
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>occ){
                res++;
            }
        }
        
        return res;
        // your code here,return the answer
    }
}
