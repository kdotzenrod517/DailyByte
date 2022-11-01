package strings;

import java.util.Arrays;
import java.util.HashMap;

public class SpellingBee {

    public static void main(String[] args){
        System.out.println(Arrays.toString(spellingBee(new int[]{3, 1, 4, 2, 5})));
        // ["Bronze Medal","5","Silver Medal","4","Gold Medal"]
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static String[] spellingBee(int[] nums) {
        String[] result = new String[nums.length];
        if(nums == null || nums.length == 0) {
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(nums);
        int count = 4;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length - 1) {
                result[map.get(nums[i])] = "Gold Medal";
            } else if(i == nums.length - 2) {
                result[map.get(nums[i])] = "Silver Medal";
            } else if(i == nums.length - 3) {
                result[map.get(nums[i])] = "Bronze Medal";
            } else {
                result[map.get(nums[i])] = count++ + "";
            }
        }

        return result;
    }
}
