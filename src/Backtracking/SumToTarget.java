package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumToTarget {

    public static void main(String[] args){
        System.out.println(sumToTarget(new int[]{8, 2, 2, 4, 5, 6, 3}, 9)); // [[2,2,5],[2,3,4],[3,6],[4,5]]
        System.out.println(sumToTarget(new int[]{2, 3, 6, 7}, 7)); // [[2,2,3],[7]]
    }

    // Runtime: O(2N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static List<List<Integer>> sumToTarget(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        findCombos(nums, 0, target, new ArrayList<>(), result);
        return result;
    }

    public static void findCombos(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0) return;

        for(int i = index; i < nums.length; i++){
            if(i == index || nums[i] != nums[i - 1]){
                current.add(nums[i]);
                findCombos(nums, i + 1, target - nums[i], current, result);
                current.remove(current.size() - 1);
            }
        }
    }




}
