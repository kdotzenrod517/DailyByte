package memoization;

import java.util.Arrays;

public class MakingChange {

    public static void main(String[] args){
        int[] coins = {1,5, 10, 25};
        System.out.println(coinChange(coins, 78)); // 6, Take three 25 coins and three 1 coins for a total of 6 coins
    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
