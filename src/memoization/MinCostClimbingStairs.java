package memoization;

public class MinCostClimbingStairs {

    static int[] memo;

    public static void main(String[] args) {
        int[] cost1 = {5, 10, 20};
        int[] cost2 = {1, 5, 10, 3, 7, 2};
        System.out.println(climbingStairs(cost1)); // 10
        System.out.println(climbingStairs(cost2)); // 10
    }

    public static int climbingStairs(int[] cost) {
        memo = new int[cost.length];
        minCost(cost, 0);
        return Math.min(memo[0], memo[1]);
    }

    private static int minCost(int[] cost, int i) {
        if (i == cost.length - 1) {
            return cost[i];
        } else if (i >= cost.length) {
            return 0;
        }
        if (memo[i] == 0) {
            int step1 = minCost(cost, i + 1) + cost[i];
            int step2 = minCost(cost, i + 2) + cost[i];
            memo[i] = Math.min(step1, step2);
        }
        return memo[i];
    }

}
