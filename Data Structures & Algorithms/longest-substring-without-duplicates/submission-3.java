class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> substr = new HashSet<>();
        int l = 0;
        int longestSubLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            while (substr.contains(currentChar)){
                substr.remove(s.charAt(l));
                l++;
            }
            substr.add(currentChar);
            longestSubLen = Math.max(longestSubLen, i - l + 1);

        }

        return longestSubLen;
    }
}
