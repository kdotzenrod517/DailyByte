package dynamicProgramming;

public class ArtThief {

    // You’ve broken into an art gallery and want to maximize the value of the paintings you steal.
    // All the paintings you steal you place in your bag which can hold at most W pounds.
    // Given that the weight and value of the ith painting is given by weights[i] and values[i] respectively,
    // return the maximum value you can steal.
    public static void main(String[] args) {
        System.out.println(knapSack(10, new int[]{4, 1, 3}, new int[]{4, 2, 7})); // 13
        System.out.println(knapSack(5, new int[]{2, 4, 3}, new int[]{3, 7, 2})); // 7
        System.out.println(knapSack(7, new int[]{1, 3, 4}, new int[]{3, 5, 6})); // 11
    }

    // Runtime: O(N * M) where N is the length of weights and M is the length of values.
    // Space complexity: O(N * M) where N is the length of weights and M is the length of values.
    // This results from our dp array.
    public static int knapSack(int W, int[] wt, int[] val) {
        int i, w;
        int[][] dp = new int[val.length + 1][W + 1];

        // Build table dp[][] in bottom up manner
        for (i = 0; i <= val.length; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        return dp[val.length][W];
    }
}
