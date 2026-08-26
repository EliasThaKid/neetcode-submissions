class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] charFreq1 = new int[26];
        int[] charFreq2 = new int[26];
        int left = 0;

        for (int i = 0; i < s1.length(); i++) {
            charFreq1[s1.charAt(i)-'a']++;
        }

        for ( int i = 0; i < s2.length(); i++) {

            int matches = 0;
            charFreq2[s2.charAt(i)-'a']++;

            if (i-left+1 == s1.length()) {
                
                for (int j = 0; j < charFreq2.length; j++) {
                    if (charFreq2[j] == charFreq1[j]) {
                        matches++;
                    }
                    if (matches == 26) {
                        return true;
                    }
                }
                
                charFreq2[s2.charAt(left)-'a']--;
                left++; 

            }
            
        }

        return false;
    }
}
