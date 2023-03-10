package math;

import java.util.Arrays;

public class LargestAndSmallest {

    public static void main(String[] args) {
        System.out.println(largestAndSmallest(new int[]{5, 5, 0, 1, 1, 4, 6})); // return 2 (update 0, 1, and 1 to be 4, then the difference is 6 - 4 = 2).
        System.out.println(largestAndSmallest(new int[]{4, 5, 20, 14, 19})); // 1
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int largestAndSmallest(int[] nums){
        if(nums.length < 5){
            return 0;
        }

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 4; i++){
            min = Math.min(min, nums[nums.length - 4 + i] - nums[i]);
        }

        return min;
    }
}
