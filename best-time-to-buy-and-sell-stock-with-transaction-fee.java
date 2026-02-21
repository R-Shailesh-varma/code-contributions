class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int curBuy, curSell, aheadBuy, aheadSell;
        aheadBuy = aheadSell = 0;
        for(int i = n - 1; i >= 0; i--){
            curBuy = Math.max(-prices[i] + aheadSell, aheadBuy);
            curSell = Math.max(prices[i]-fee + aheadBuy, aheadSell);
            aheadBuy = curBuy;
            aheadSell = curSell; 
        }
        return aheadBuy;
    }
}