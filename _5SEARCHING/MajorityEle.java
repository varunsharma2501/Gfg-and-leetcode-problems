

//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int size)
    {
        Arrays.sort(arr);
        int occ=1;
        if(size==1){
            return arr[0];
        }
        for(int i=1;i<size;i++){
            if(arr[i]==arr[i-1]){
                occ++;
            }
            else{
            occ=1;    
            }
            
            if(occ>size/2){
                return arr[i];
            }
        }



        // better approach in O(n) time 
        

//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int size)
    {
        Arrays.sort(arr);
        int occ=1;
        if(size==1){
            return arr[0];
        }
        for(int i=1;i<size;i++){
            if(arr[i]==arr[i-1]){
                occ++;
            }
            else{
            occ=1;    
            }
            
            if(occ>size/2){
                return arr[i];
            }
        }
        return -1;
        // your code here
    }
}
        return -1;
        // your code here
    }
}
