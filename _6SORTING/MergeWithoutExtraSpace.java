

//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void swap(long [] arr1 ,long [] arr2, int i , int j)
    {
        long temp = arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i= arr1.length-1;
        int j = 0;
        
        while(i>=0 && j<arr2.length)
        {
            // System.out.print("hello ");
            if(arr1[i]>= arr2[j])
            {
                swap(arr1,arr2,i,j);
            }
            else
            {
                break;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
