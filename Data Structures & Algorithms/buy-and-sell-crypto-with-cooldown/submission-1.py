class Solution:
    def maxProfit(self, prices: List[int]) -> int:
       # buy or sell
       # if buy i + 1
       # if sell i + 2 because of cooldown

        dp = {} # cache we will key in on (i, buying (boolean)), val max profit at this key

        def dfs(i, buying):
            if i >= len(prices): # base case ran out of days/time no more options
                return 0 # why 0
            if (i, buying) in dp: # we have seen this value
                return dp[(i, buying)]                

            if buying:
                buy = dfs(i+1, not buying) - prices[i]
                cooldown = dfs(i+1, buying)
                dp[(i,buying)] = max(buy, cooldown) #where we cache the result 
            else: # sell case 
                sell = dfs (i+2, not buying) + prices[i]
                cooldown = dfs(i+1, buying)
                dp[(i,buying)] = max(sell, cooldown) #where we cache the result 
            return dp[(i, buying)]
            
        return dfs(0, True)