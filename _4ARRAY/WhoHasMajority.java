

// User function Template for Java

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        int x_c=0,y_c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                x_c++;
            }
            else if(arr[i]==y){
                y_c++;
            }
            else{
                
            }
        }
        if(x_c==y_c){
            return Math.min(x,y);
        }
        else if(x_c>y_c){
            return x;
        }
        else{
            return y;
        }
        // code here
    }
}
