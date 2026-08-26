class Solution {
    public int maxProfit(int[] prices) {
       
        int left = 0;
        int right = prices.length-1; 
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

        }



        return maxProfit;
    }
}
