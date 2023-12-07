

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> al =new ArrayList<Integer>();
        int max=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                al.add(arr[i]);
                max=arr[i];
         
            }
        }
        Collections.reverse(al);
        return al;
        // Your code here
    }
}
