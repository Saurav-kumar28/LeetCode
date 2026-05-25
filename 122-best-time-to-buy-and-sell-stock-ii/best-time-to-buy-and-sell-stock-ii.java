class Solution {
    public int maxProfit(int[] prices) {
        int maxprice = 0;
        int n = prices.length;
        for(int i =0; i<n-1; i++){
            if(prices[i+1]>prices[i]){
                maxprice = maxprice + (prices[i+1]-prices[i]);
            }
        }
        return maxprice;
    }
}