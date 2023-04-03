package Lists;

import java.util.Arrays;

public class UniqueNumbers {

    public static void main(String[] args) {
        System.out.println(updateNumbers(new int[]{2, 2, 1, 3})); // return 2 (increment one of the twos twice or increment one 2 once and the 3 once).
        System.out.println(updateNumbers(new int[]{4, 1, 2})); // 0 operations are needed
    }


    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int updateNumbers(int[] nums) {
        Arrays.sort(nums);
        int operations = 0;
        int previous = 0;
        for (int num: nums) {
            operations += Math.max(previous - num, 0);
            previous = Math.max(previous, num) + 1;
        }

        return operations;
    }
}
