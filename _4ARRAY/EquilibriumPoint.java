

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
int total=0;
for(int i=0;i<n;i++){
    total+=arr[i];
}
if(n==1 || total==arr[0]){
    return 1;
}

int left=0;
for(int i=1;i<n;i++){
    left+=arr[i-1];
    int right=total-left-(int)arr[i];
    if(left==right){
        return i+1;
    }
}
return -1;
        // Your code here
    }
}
