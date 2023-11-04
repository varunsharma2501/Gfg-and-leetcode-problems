class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        int i=0,j=0;
        int total=n+m;
        
        int ind2=(n+m)/2;
        int ind1=ind2-1;
        int count=0;
        
        int indval1=-1;
        int indval2=-1;
        
        
        while(i<n && j<m){
            if(arr[i]<brr[j]){
                if(count==ind1){indval1=arr[i];}
                if(count==ind2){indval2=arr[i];}
                i++;
                count++;
            }
            else{
                if(count==ind1){indval1=brr[j];}
                if(count==ind2){indval2=brr[j];}
                j++;
                count++;
            }
        }
        
        while(i<n){
            if(count==ind1){indval1=arr[i];}
            if(count==ind2){indval2=arr[i];}
            i++;
            count++;
        }
        while(j<m){
            if(count==ind1){indval1=brr[j];}
            if(count==ind2){indval2=brr[j];}
            j++;
            count++;
        }
        
        if((n+m)%2!=0){
            return indval2;
        }
        else{
            return (indval1+indval2)/2;
        }
        //Your code here
    }
}
