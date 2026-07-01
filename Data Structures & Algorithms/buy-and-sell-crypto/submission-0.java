class Solution {
    public int maxProfit(int[] prices) {
        int MinProfit = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(MinProfit>prices[i]){
                MinProfit = prices[i];
            }
            int profit = prices[i] - MinProfit;
            if(MaxProfit<profit){
                MaxProfit = Math.max(profit,MaxProfit);
            }
        }

        return MaxProfit;
    }
}
