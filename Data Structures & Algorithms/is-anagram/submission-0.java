class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) { return false; }

        int[] charCount1 = new int[26];
        for (char c : s.toCharArray()) {
            charCount1[c - 'a']++;
        }
        int[] charCount2 = new int[26];
        for (char c : t.toCharArray()) {
            charCount2[c - 'a']++;
        }


        for (int i = 0; i < charCount1.length; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true; 


    }
}
