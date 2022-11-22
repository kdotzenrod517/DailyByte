package Backtracking;

import java.util.*;

public class IncreasingSequence {

    public static void main(String[] args){
        // [[1,2],[1,2,3],[1,3],[2,3]]
        System.out.println(backtracking(new int[]{1, 2, 3}));
        // [[2,4],[2,4,5],[2,3],[2,3,5],[2,5],[4,5],[3,5]]
        System.out.println(backtracking(new int[]{2, 3, 4, 5}));
    }

    // Runtime: O(2N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static List<List<Integer>> backtracking(int[] nums) {
        List<List<Integer>> subsets = new LinkedList<>(); // return object
        generateSubsets(new LinkedList<>(), 0, nums, subsets);

        return subsets;
    }

    // current = current subset we're creating
    // index = within our nums
    // nums
    // subsets
    private static void generateSubsets(LinkedList<Integer> current, int index, int[] nums, List<List<Integer>> subsets) {
        if (current.size() > 1) {
            subsets.add(new LinkedList<>(current));
        }

        // keep track of numbers we’ve already used to
        // ensure we don’t add duplicate subsets to our return list
        Set<Integer> used = new HashSet<>();
        for(int i = index; i < nums.length; i++) {
            if (used.contains(nums[i])) {
                continue;
            }

            if(current.size() == 0 || nums[i] >= current.peekLast()) {
                used.add(nums[i]);
                current.add(nums[i]);
                generateSubsets(current, i + 1, nums, subsets);
                current.remove(current.size() - 1);
            }
        }
    }
}


