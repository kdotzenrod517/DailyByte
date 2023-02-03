package Lists;

import java.util.Arrays;

public class UpdateArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(updateArray(new int[]{5, 2, 3}))); // return [3, 3, -1].
        System.out.println(Arrays.toString(updateArray(new int[]{10, 2, 5, 8, 9}))); // return [9,9,9,9,-1]
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int[] updateArray(int[] nums){
        int max = -1;
        for(int i = nums.length - 1; i >= 0; i--){
            int temp = nums[i];
            nums[i] = max;
            max = Math.max(temp, max);
        }
        return nums;
    }
}
