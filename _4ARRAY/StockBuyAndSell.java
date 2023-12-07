

//User function Template for Java

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        
        for(int i=1;i<n;i++){
            if(A[i]>A[i-1]){
                ArrayList<Integer> ls=new ArrayList<Integer>();
                ls.add(i-1);
                ls.add(i);
                res.add(ls);
            }
        }
        return res;
        // code here
    }
}
