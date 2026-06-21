class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;

        int min_price = prices[0];

        for(int i=0;i<prices.length;i++){
            min_price = Math.min(prices[i],min_price);

            int profit = prices[i] - min_price;

            max_profit = Math.max(max_profit,profit);
        }

        return max_profit;
    }
}
