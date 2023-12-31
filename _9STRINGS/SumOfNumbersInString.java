class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static long findSum(String str) {
        long res = 0; // Changed to long to avoid potential overflow for larger sums
        char arr[] = str.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            
            // Checking if the current character is a digit
            while (i < arr.length && Character.isDigit(arr[i])) {
                sum = sum * 10 + Character.getNumericValue(arr[i]); // Using getNumericValue() to convert char to int
                i++;
            }
            
            res += sum;
        }
        return res;
    }
}
