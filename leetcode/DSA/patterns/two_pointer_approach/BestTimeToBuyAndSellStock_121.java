package leetcode.DSA.patterns.two_pointer_approach;

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = 0;
        int price = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < price) {
                price = prices[i];
            } else {
                int currentProfit = prices[i] - price;
                profit = Math.max(profit, currentProfit);
            }

        }

        System.out.println(profit);
    }
}
