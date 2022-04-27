package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1, 3, 8, 2}, 10)); // true
        System.out.println(twoSum(new int[]{3, 9, 13, 7}, 8)); // false
        System.out.println(twoSum(new int[]{4, 2, 6, 5, 2}, 4)); // true

        System.out.println(Arrays.toString(twoSumIndexes(new int[]{1, 3, 8, 2}, 10))); // true
        System.out.println(Arrays.toString(twoSumIndexes(new int[]{3, 9, 13, 7}, 8))); // false
        System.out.println(Arrays.toString(twoSumIndexes(new int[]{4, 2, 6, 5, 2}, 4))); // true
    }

    private static int[] twoSumIndexes(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int i : nums) {
            map.put(i, index++);
        }

        for(int i = 0; i < nums.length; i++){
            int comp = k - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[]{i, map.get(comp)};
            }
        }

        return null;
    }

    private static boolean twoSum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : nums) {
            map.put(i, index++);
        }

        for (int i = 0; i < nums.length; i++) {
            int comp = k - nums[i];
            if (map.containsKey(comp) && map.get(comp) != i) {
                return true;
            }
        }

        return false;
    }
}
