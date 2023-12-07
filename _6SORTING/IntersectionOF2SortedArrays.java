

//User function Template for Java

class Solution
{
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        int i=0,j=0;
        boolean flag=false;
        int latest=0;
        
        ArrayList<Integer> ls=new ArrayList<Integer>();
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                
                if(arr1[i]==latest){
                    
                }
                else{
                ls.add(arr1[i]);
                }
                latest=arr1[i];
                i++;j++;
                flag=true;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        
        if(flag==false){
            ls.add(-1);
        }
        return ls;
        // add your code here
    }

}
