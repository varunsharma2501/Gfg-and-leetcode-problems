

class Solution {
    
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<n;i=i+2){
        if((i+1)>=n){
            return;
        }
        
            // swap(a[i],a[i+1]);
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
}
        
