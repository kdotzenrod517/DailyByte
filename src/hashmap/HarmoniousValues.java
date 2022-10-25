package hashmap;

import java.util.HashMap;

public class HarmoniousValues {

    // Given an integer array, nums, return the length of the longest harmonious subsequence it contains.
    // Note: A harmonious subsequence is a subsequence in
    // which the difference between the largest value and the smallest value in the subsequence is exactly one.
    public static void main(String[] args){
        System.out.println(harmoniousValues(new int[]{1,1})); // 0
        System.out.println(harmoniousValues(new int[]{3, 4, 5})); // 2
        System.out.println(harmoniousValues(new int[]{3, 2, 2, 2, 4, 3, 3})); // 6
    }

    // Runtime: O(N) where N is the total number of values in nums.
    // Space complexity: O(N) where N is the total number of values in nums.
    public static int harmoniousValues(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int longest = 0;
        for(int key: map.keySet()) {
            if(map.containsKey(key + 1)) {
                longest = Math.max(longest, map.get(key) + map.get(key + 1));
            }
        }

        return longest;
    }
}
