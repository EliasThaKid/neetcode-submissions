class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxlen = 0;
        i = 0
        mp = {}
    
        for j in range(len(s)):
            if s[j] in mp:
                i = max(mp[s[j]] + 1, i)
            mp[s[j]] = j
            maxlen = max(maxlen, j - i + 1)

                
        return maxlen
