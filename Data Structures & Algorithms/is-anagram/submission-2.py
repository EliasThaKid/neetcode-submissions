class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        lettermap = {}
        lettermap2 = {}

        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] not in lettermap:
                lettermap[s[i]] = 1
            else: 
                lettermap[s[i]] += 1
            if t[i] not in lettermap2:
                lettermap2[t[i]] = 1
            else: 
                lettermap2[t[i]] += 1

        for key in lettermap: 
            if key not in lettermap2:
                return False
            elif lettermap[key] != lettermap2[key]:
                return False

        return True