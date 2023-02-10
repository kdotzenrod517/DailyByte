package DP;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        System.out.println(longestIncreasingSubsequence(new int[]{1, 9, 7, 4, 7, 13})); // 4, The longest increasing subsequence is 1, 4, 7, 13.
    }

    // Runtime: O(N2) where N is the number of elements in nums. This results from having our two nested for loops.
    // Space complexity: O(N) where N is the number of elements in nums. This results from storing N elements in our dp array.
    public static int longestIncreasingSubsequence(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for(int i = 1; i < dp.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int longest = Integer.MIN_VALUE;
        for(int i: dp) {
            longest = Math.max(longest, i);
        }

        return longest;
    }
}
