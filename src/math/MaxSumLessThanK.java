package math;

import java.util.Arrays;

public class MaxSumLessThanK {

    public static void main(String[] args) {
        System.out.println(maxSumLessThanK(new int[]{8, 2, 4, 9}, 13)); // 12 (8 + 4 = 12 < 13).
        System.out.println(maxSumLessThanK(new int[]{19, 10, 14, 23, 12}, 39)); // 37
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int maxSumLessThanK(int[] nums, int k){
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int max = -1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum < k){
                max = Math.max(max, sum);
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
