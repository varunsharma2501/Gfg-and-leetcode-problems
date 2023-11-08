

//User function Template for Java

class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    
    public static int min(int a,int b,int c){
        int temp=a<b?a:b;
        int res=temp<c?temp:c;
        return res;
    }
    
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        int a=A.length;
        int b=B.length;
        int c=C.length;
        
        ArrayList<Integer> ls=new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while(i<a && j<b && k<c){
            if(min(A[i],B[j],C[k])==A[i]){
                ls.add(A[i]);
                i++;
            }
            else if(min(A[i],B[j],C[k])==B[j]){
                ls.add(B[j]);
                j++;
            }
            else{
                ls.add(C[k]);
                k++;
            }
        }
        
        while(i<a && j<b){
            if(A[i]<B[j]){
                ls.add(A[i]);
                i++;
            }
            else{
                ls.add(B[j]);
                j++;
            }
        }
        
         while(i<a && k<c){
            if(A[i]<C[k]){
                ls.add(A[i]);
                i++;
            }
            else{
                ls.add(C[k]);
                k++;
            }
        }
        
         while(j<b && k<c){
            if(B[j]<C[k]){
                ls.add(B[j]);
                j++;
            }
            else{
                ls.add(C[k]);
                k++;
            }
        }
        
        while(i<a){
            ls.add(A[i]);
            i++;
        }
        while(j<b){
            ls.add(B[j]);
            j++;
        }
        while(k<c){
            ls.add(C[k]);
            k++;
        }
        // add ypur code here
        return ls;
    }
}
