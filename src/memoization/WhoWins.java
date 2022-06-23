package memoization;

public class WhoWins {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(predictTheWinner(nums)); // true, player 1 wins
    }

    // Time complexity : O(n^2). The entire memo array of size nxn is filled only once. Here, nn refers to the size of nums array.
    //
    //Space complexity : O(n^2). memo array of size nxn is used for memoization.
    public static boolean predictTheWinner(int[] nums) {
        Integer[][] memo = new Integer[nums.length][nums.length];
        return winner(nums, 0, nums.length - 1, memo) >= 0;
    }

    public static int winner(int[] nums, int s, int e, Integer[][] memo) {
        if (s == e)
            return nums[s];
        if (memo[s][e] != null)
            return memo[s][e];
        int a = nums[s] - winner(nums, s + 1, e, memo);
        int b = nums[e] - winner(nums, s, e - 1, memo);
        memo[s][e] = Math.max(a, b);
        return memo[s][e];
    }
}
