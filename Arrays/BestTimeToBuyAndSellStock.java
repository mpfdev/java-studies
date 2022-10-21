class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int overallProfit = 0;
        int smallestPrice = prices[0];
        int iterateProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            
            if(prices[i] < smallestPrice) {
                smallestPrice = prices[i];
            }
            
            iterateProfit = prices[i] - smallestPrice;;
            
            if (iterateProfit > overallProfit) {
                overallProfit = iterateProfit;
            }
            
        }
        
        return overallProfit;
        
    }
}
