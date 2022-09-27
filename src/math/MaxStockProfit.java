package math;

public class MaxStockProfit {

    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{8, 3, 2, 4, 6, 4, 5})); // 5
    }

    // If the next price is larger than the current price we can make a profit
    // of the difference between the prices. By constantly adding up these
    // differences we can eventually return our maximum profit.

    // Runtime: O(N) where N is the total number of elements in prices.
    // Space complexity: O(1) or constant.
    public static int maxProfit(int[] prices){
       int maxProfit = 0;

       for(int i = 0; i < prices.length - 1; i++){
           if(prices[i] < prices[i + 1]){
               maxProfit += prices[i + 1] - prices[i];
           }
       }

       return maxProfit;
    }
}
