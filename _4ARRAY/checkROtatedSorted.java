
class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
 public static boolean checkRotatedAndSorted(int arr[], int num){
        boolean res=true;
        // int n=arr.length;
        int flag=0;
        // check if ascending order

        if(arr[0]>arr[num-1]){
            for(int i=0;i<num-1;i++){
                if(arr[i]>arr[i+1]){
                    flag+=1;
                }
            }
        }
        // checking for the descneding order case
        else if(arr[0]<arr[num-1]){
            for(int i=0;i<num-1;i++){
                if(arr[i]<arr[i+1]){
                    flag+=1;
                }
            }
        }

        if(flag==1){
            return true;
        }
        else{
            return false;
        }
        // return res;
    }
}

