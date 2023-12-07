#User function Template for python3

##Complete this code
# Rest of the code is already given

class Solution:
    def arrange(self,arr, n): 
        for i in range(n):
            arr.append(arr[arr[i]])
        arr[:] = arr[n:]
