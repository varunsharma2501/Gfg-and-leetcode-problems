

class Solution{

    // Function to find floor for the given x
    // this is just like binary search
    static int findFloorUtil(long arr[], int low, int high, long x)
    {
        // If low and high cross each other 
        if (low > high) 
            return -1; 
  
        // If last element is smaller than x 
        if (x >= arr[high]) 
            return high; 
  
        // Find the middle point 
        int mid = (low+high)/2; 
  
        // If middle point is floor. 
        if (arr[mid] == x) 
            return mid; 
  
        // If x lies between mid-1 and mid 
        if (mid > 0 && arr[mid-1] <= x && x < 
                                    arr[mid]) 
            return mid-1; 
  
        // If x is smaller than mid, floor 
        // must be in left half. 
        if (x < arr[mid]) 
            return findFloorUtil(arr, low,  
                               mid - 1, x); 
  
        // If mid-1 is not floor and x is 
        // greater than arr[mid], 
        return findFloorUtil(arr, mid + 1, high, 
                                         x); 
    }
    static int findFloor(long arr[], int n, long x)
    {
        return findFloorUtil(arr, 0, n-1, x);
    }
    
}
