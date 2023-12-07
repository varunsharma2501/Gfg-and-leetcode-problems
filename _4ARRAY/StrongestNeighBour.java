//User function Template for Java

class StrongestNeighbour{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        // int arr[]=new int[sizeOfArray-1];
        for(int i=0;i<sizeOfArray-1;i++){
            if(arr[i]>=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.print(arr[i+1]+" ");
            }
        }
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
        
    }
}

