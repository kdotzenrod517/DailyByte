package Lists;

import java.util.Arrays;

public class ArrayPairSumMin {

    public static void main(String[] args) {
        System.out.println(arrayPairs(new int[] {1, 3, 2, 4})); // (min(1, 2) + min(3, 4) = 4)
        System.out.println(arrayPairs(new int[] {2, 4, 2, 8, 4, 3})); // 9
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    private static int arrayPairs(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }
}
