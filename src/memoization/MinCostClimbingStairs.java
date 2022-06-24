package memoization;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost1 = {5, 10, 20};
        int[] cost2 = {1, 5, 10, 3, 7, 2};
        System.out.println(minCostStairs(cost1)); // 10
        System.out.println(minCostStairs(cost2)); // 10
    }

    // Runtime: O(N) where N is the total number of elements in cost.
    // Space complexity: O(N) where N is the total number of elements in cost. This extra space results in our memoize array.
    public static int minCostStairs(int[] cost) {
        int[] memoize = new int[cost.length];
        return Math.min(climbSteps(cost.length - 1, cost, memoize), climbSteps(cost.length - 2, cost, memoize));
    }

    public static int climbSteps(int step, int[] cost, int[] memoize) {
        if (step == 0 || step == 1) {
            return cost[step];
        } else if (memoize[step] != 0) {
            return memoize[step];
        } else {
            memoize[step] = cost[step] + Math.min(climbSteps(step - 1, cost, memoize),
                    climbSteps(step - 2, cost, memoize));
            return memoize[step];
        }
    }
}
