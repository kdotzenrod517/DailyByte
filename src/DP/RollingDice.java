package DP;

public class RollingDice {

    public static void main(String[] args) {
        System.out.println(rollingDice(1, 6, 5)); // return 1 (there is only one way to roll the single die to sum to 5 i.e. roll a 5).
        System.out.println(rollingDice(2, 6, 4)); // 3
    }

    // Runtime: O(N x target x max).
    // Space complexity: O(N x target).
    private static int rollingDice(int N, int max, int target) {
        int[][] dp = new int[N + 1][target + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= N; i++){
            for(int j = 0; j <= target; j++){
                for(int k = 1; k <= max; k++){
                    if(j >= k){
                        dp[i][j] += dp[i - 1][j - k];
                    } else {
                        break;
                    }
                }
            }
        }

        return dp[N][target];
    }
}
