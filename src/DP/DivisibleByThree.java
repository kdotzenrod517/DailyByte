package DP;

import java.util.Arrays;

public class DivisibleByThree {

    //  We can create a dp array that will store three elements. Each element in our dp array will
    //  represent the largest sum modded by three leaving no remainder,
    //  the largest sum modded by three leaving a remainder of one,
    //  and the largest sum modded by three leaving a remainder
    //  of two respectively. With our dp array initialized,
    //  we can start iterating through our nums.
    //  For each value in nums, we can create a copy of our dp array, temp.
    //  We can then iterate through every value in temp
    //  updating dp[(num + temp[i]) % 3] to be the
    //  maximum between dp[(num + temp[i]) % 3] and
    //  adding the current num to temp[i]
    //  (i.e. adding the current number plus the largest sum with a
    //  remainder of zero, one, or two when divided by three).
    //  Once our loop ends, we can simply return dp[0]
    //  (i.e. the largest sum we could create that is still divisible by three).
    public static void main(String[] args) {
        System.out.println(divisibleByThree(new int[]{3, 1, 5, 8, 2})); // 18 (3 + 5 + 8 + 2).
        System.out.println(divisibleByThree(new int[]{2, 4, 9})); // 15
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int divisibleByThree(int[] nums){
        int[] dp = new int[3];
        for(int num : nums){
            int[] temp = Arrays.copyOf(dp, 3);
            for(int i = 0; i < 3; i++){
                dp[(num + temp[i]) % 3] = Math.max(dp[(num + temp[i]) % 3], num + temp[i]);
            }
        }

        return dp[0];
    }
}
