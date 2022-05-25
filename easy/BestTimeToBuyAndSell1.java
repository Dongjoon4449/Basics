package easy;

public class BestTimeToBuyAndSell1 {

    public static int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int profit;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = prices[i] - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        
        
        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 9};
        System.out.println(maxProfit(prices));

    }
}
