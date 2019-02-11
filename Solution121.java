public class Solution121 {

    /**
     * Dynamic planning
     * 2ms, 85.90%
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int minPrice = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if ((price - minPrice) > profit)
                profit = price - minPrice;
        }
        return profit;
    }
}
