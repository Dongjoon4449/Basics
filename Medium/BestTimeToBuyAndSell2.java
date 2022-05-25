package Medium;

public class BestTimeToBuyAndSell2 {
    
    public static int maxProfit(int[] prices) {
        int profit;
        int total = 0;

        for(int i = 0; i < prices.length - 1; i++) {
            profit = prices[i + 1] - prices[i];
            if(profit > 0) {
                total += profit;
            }
        }
        return total;
    }
    
    
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 7};       
        System.out.println(maxProfit(prices));

    }

}
