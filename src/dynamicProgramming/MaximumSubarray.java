package dynamicProgramming;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubarray(new int[]{-3, 8, -8, 2})); // return 8 (8)
        System.out.println(maxSubarray(new int[]{2, 3, -4, 2})); //  return 5 (2 + 3)
        System.out.println(maxSubarray(new int[]{1, 5, -2, -3, 7})); // return 8 (1 + 5 + (-2) + (-3) + 7)
    }

    public static int maxSubarray(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];

        for(int i = 1; i < n; i++){
            dp[i] = nums[i] + (Math.max(dp[i - 1], 0));
            max = Math.max(dp[i], max);
        }

        return max;
    }
}
