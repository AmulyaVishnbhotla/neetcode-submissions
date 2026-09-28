class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i=0;i<prices.length;i++){
            int profit = 0;
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else{
                profit = prices[i]-minPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
        }

        return maxProfit;
        
    }
}
