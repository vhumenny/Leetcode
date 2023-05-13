package bestTimeToBuyAndSellStock;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        int[] prices = new int[]{2, 1, 8, 3, 7, 4};
//        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];
        for (int currentPrice : prices) {
            if (currentPrice - buyPrice > profit) profit = currentPrice - buyPrice;
            else if (currentPrice < buyPrice) buyPrice = currentPrice;
        }
        return profit;
    }

}

