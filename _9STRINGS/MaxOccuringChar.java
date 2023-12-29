class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = line.length();

        for (int i = 0; i < n; i++) {
            map.put(line.charAt(i), map.getOrDefault(line.charAt(i), 0) + 1);
        }

        char res = '\0'; // Initialize res as an empty character
        int maxOccurrence = Integer.MIN_VALUE; // Initialize maxOccurrence as minimum value

        for (Map.Entry<Character, Integer> el : map.entrySet()) {
            if (el.getValue() > maxOccurrence) {
                maxOccurrence = el.getValue();
                res = el.getKey();
            } else if (el.getValue() == maxOccurrence && el.getKey() < res) {
                // If occurrence is the same, update res only if the current character has a smaller ASCII value
                res = el.getKey();
            }
        }

        return res;
    }
}
