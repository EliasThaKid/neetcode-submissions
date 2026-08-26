class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = {}

        for i, word in enumerate(strs): 
            count = [0] * 26
            for ch in word: 
                count[ord(ch)-ord('a')] += 1
            ans.setdefault(tuple(count), []).append(word)
        
        return list(ans.values())