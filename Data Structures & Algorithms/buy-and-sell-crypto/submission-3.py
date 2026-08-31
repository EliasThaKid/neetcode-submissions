class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0

        maxprof = 0
        minval = prices[0]

        for i in range(len(prices)):
            maxprof = max((prices[i] - minval), maxprof)
            minval = min(minval, prices[i])
        
        return maxprof