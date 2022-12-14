class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2)
            return 0;
        
        int maxDiff = prices[1] - prices[0];
        int min = prices[0];
        
        for(int i = 0; i < prices.length; ++i)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            if(prices[i] - min > maxDiff)
            {
                maxDiff = prices[i] - min;
            }
                
        }
        
        return maxDiff;
    }
}