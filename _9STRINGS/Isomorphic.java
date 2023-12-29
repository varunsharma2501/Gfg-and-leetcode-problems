class Solution {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Boolean> mapped = new HashMap<>(); // To check if a character in str2 is already mapped

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (mapped.containsKey(c2)) {
                    return false; // If c2 is already mapped to a different character in str1
                }
                map.put(c1, c2);
                mapped.put(c2, true);
            }
        }

        return true;
    }
}
