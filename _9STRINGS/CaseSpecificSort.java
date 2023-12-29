class Solution {
    // Function to perform case-specific sorting of strings.
    public static String caseSort(String str) {
        int n = str.length();
        ArrayList<Character> lower = new ArrayList<>();
        ArrayList<Character> upper = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lower.add(c);
            } else {
                upper.add(c);
            }
        }

        Collections.sort(lower);
        Collections.sort(upper);
        
        StringBuilder resBuilder = new StringBuilder();
        int l = 0, u = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                resBuilder.append(lower.get(l));
                l++;
            } else {
                resBuilder.append(upper.get(u));
                u++;
            }
        }
        
        return resBuilder.toString();
    }
}
