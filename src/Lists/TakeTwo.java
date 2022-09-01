package Lists;

import java.util.ArrayList;
import java.util.List;

public class TakeTwo {

    // Given an array of integers, nums, each element in the array either appears once or twice.
    // Return a list containing all the numbers that appear twice.
    public static void main(String[] args){
        System.out.println(takeTwo(new int[]{2, 3, 1, 5, 5})); // [5]
        System.out.println(takeTwo(new int[]{1, 2, 3})); //
        System.out.println(takeTwo(new int[]{7, 2, 2, 3, 3, 4, 4})); // [2,3,4]
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static List<Integer> takeTwo(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }

        return duplicates;
    }
}
