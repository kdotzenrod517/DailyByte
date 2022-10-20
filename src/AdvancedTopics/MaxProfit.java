package AdvancedTopics;

public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{8, 9, 2, 3, 5, 2, 4})); // 3
        System.out.println(maxProfit(new int[]{10, 8, 3, 1})); // 0
    }

    // Runtime: O(N) where N is the total number of elements in prices.
    // Space complexity: O(1) or constant.
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int max = 0;
        int min = prices[0];

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }

        return max;
    }
}
