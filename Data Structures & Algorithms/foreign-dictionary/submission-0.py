class Solution:
    def foreignDictionary(self, words: List[str]) -> str:
        #adjency list
        adj = {c:set() for w in words for c in w }

        for i in range(len(words)-1):
        #edgecase for when prefixes are before their longer one
            w1, w2 = words[i], words[i+1]
            minlen = min(len(w1), len(w2))
            if len(w1) > len(w2) and w1[:minlen] == w2[:minlen]:
                return ""
            for j in range(minlen):
                if w1[j] != w2[j]:
                    adj[w1[j]].add(w2[j])
                    break
        visit = {} #falsevisited, trueCcurrentpath, not in was never    visited \

        res =[] #will join in rev order

        def dfs(c): #postorder
            if c in visit:
                return visit[c]
            visit[c] = True #current path
            for nei in adj[c]:
                if dfs(nei):
                    return True
            visit[c] = False
            res.append(c)

        for c in adj:
            if dfs(c):
                return ""
        res.reverse()
        return "".join(res)

