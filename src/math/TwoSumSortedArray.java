package math;

import java.util.Arrays;

public class TwoSumSortedArray {

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 5, 7, 9}, 10))); // [1,5]
        System.out.println(Arrays.toString(twoSum(new int[]{1, 3, 8}, 13))); // null
    }

    // Runtime: O(N) where N is the total numbers in nums.
    // Space complexity: O(1) or constant
    private static int[] twoSum(int[] nums, int target){

        int l = 0;
        int r = nums.length - 1;
        int[] ans = new int[2];

        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum > target){
                r--;
            } else if (sum < target){
                l++;
            } else {
                ans[0] = l + 1;
                ans[1] = r + 1;
                return ans;
            }
        }

        return null;
    }
}
