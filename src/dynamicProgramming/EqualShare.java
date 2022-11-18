package dynamicProgramming;

import java.util.HashMap;

public class EqualShare {

    public static void main(String[] args) {
        System.out.println(equalShare(new int[]{1, 1, 2})); // true
        System.out.println(equalShare(new int[]{10, 3, 2})); // false
    }

    // Runtime: O(N * M) where N is the total sum of all values
    // in nums and M is the total number of elements in nums.
    // Space complexity: O(N * M) where N is the total sum of all
    // values in nums and M is the total number of elements in nums.
    public static boolean equalShare(int[] nums) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }

        if (total % 2 != 0) {
            return false;
        }

        return equalShare(nums, 0, 0, total, new HashMap<String, Boolean>());
    }

    public static boolean equalShare(int[] nums, int index, int sum, int total, HashMap<String, Boolean> state) {
        String current = index + "" + sum;
        if (state.containsKey(current)) {
            return state.get(current);
        }
        if (sum * 2 == total) {
            return true;
        }
        if (sum > total / 2 || index >= nums.length) {
            return false;
        }

        boolean foundPartition = equalShare(nums, index + 1, sum, total, state) || equalShare(nums, index + 1, sum + nums[index], total, state);
        state.put(current, foundPartition);
        return foundPartition;
    }
}
