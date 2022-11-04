package Lists;

import java.util.Arrays;

public class AllEqual {

    public static void main(String[] args){
        //  3. [1, 2, 3] -> [2, 3, 3] -> [3, 4, 3] -> [4, 4, 4]
        System.out.println(equalize(new int[]{1, 2, 3}));
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int equalize(int[] nums){
        int result = 0;
        if(nums == null || nums.length == 0) {
            return result;
        }

        int min = Integer.MAX_VALUE;
        for(int i: nums) {
            min = Math.min(min, i);
        }

        for(int i: nums) {
            result += i - min;
        }

        return result;
    }
}
