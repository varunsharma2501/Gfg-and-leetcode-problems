// class Solution
// {
//     //Function to find the smallest positive number missing from the array.
//     static int missingNumber(int arr[], int size)
//     {
//         int counter=0;
//         Arrays.sort(arr);
//         for(int i=0;i<size;i++){
//             if(arr[i]>=1){
//                 if(arr[i]>counter+1){
//                     return counter+1;
//                 }
//                 counter=arr[i];
//             }
//         }
//         return counter+1;
//         // Your code here
//     }
// }

// better approach 

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        for(int i=0;i<size;i++){
            if(arr[i]<1){
                arr[i]=0;
            }
        }
        
        for(int i=0;i<size;i++){
            int correctIndex=arr[i]-1;
            
         while(0<=correctIndex && correctIndex<=size-1 && arr[correctIndex]!=arr[i]){
            //   swap(arr[correctIndex],arr[i])
            int temp=arr[correctIndex];
            arr[correctIndex]=arr[i];
            arr[i]=temp;
            
            correctIndex=arr[i]-1;
            }
        }
        
        for(int i=0;i<size;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        
        return size+1;
        // Your code here
    }
}
