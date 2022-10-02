package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {

    // Given a list of integers, nums, return a list containing all triplets that sum to zero.
    public static void main(String[] args){
        System.out.println(triplets(new int[]{0})); // []
        System.out.println(triplets(new int[]{0, -1, 1, 1, 2, -2})); // [[-2,0,2],[-2,1,1],[-1,0,1]]
    }

    // Runtime: O(N2) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static List<List<Integer>> triplets(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) {
            return triplets;
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;
                while(left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0) {
                        triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while(left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if(sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return triplets;
    }
}
