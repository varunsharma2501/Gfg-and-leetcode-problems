class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i=0,j=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        while(i<n && j<m){
            while(i<n-1 && arr1[i]==arr1[i+1]){
                i++;
            }
            while(j<m-1 && arr2[j]==arr2[j+1]){
                j++;
            }
            
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;j++;
            }
            else if(arr1[i]>arr2[j]){
                ans.add(arr2[j]);
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
            }
        }
        
        while(i<n){
            while(i<n-1 && arr1[i]==arr1[i+1]){
                i++;
            }
            ans.add(arr1[i]);
            i++;
        }
        while(j<m){
            while(j<m-1 && arr2[j]==arr2[j+1]){
                j++;
            }
            ans.add(arr2[j]);
            j++;
        }
        // add your code here
        
        return ans;
    }
}
