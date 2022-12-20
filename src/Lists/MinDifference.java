package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDifference {

    public static void main(String[] args) {
        System.out.println(minDifference(new int[]{4, 2, 3})); //  return [[2, 3], [3, 4]]
        // (the minimum difference between any two elements is one and 3 - 2 = 1 and 4 - 3 = 1).
        System.out.println(minDifference(new int[]{6, 2, 5, 3, 1})); // return [[1, 2], [2, 3], [5, 6]].
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static List<List<Integer>> minDifference(int[] nums){
        List<List<Integer>> minimums = new ArrayList<>();

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for(int i = 1; i < nums.length; i++){
            int difference = nums[i] - nums[i - 1];
            if(difference < min){
                min = difference;
                minimums = new ArrayList<>();
                minimums.add(Arrays.asList(nums[i - 1], nums[i]));
            } else if (difference == min){
                minimums.add(Arrays.asList(nums[i - 1], nums[i]));
            }
        }


        return minimums;
    }
}
