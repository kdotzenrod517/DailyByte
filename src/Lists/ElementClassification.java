package Lists;

import dynamicProgramming.ArtThief;

import java.util.Arrays;
import java.util.HashMap;

public class ElementClassification {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(classification(new int[]{7, 9, 8}))); //  [1, 3, 2]
        System.out.println(Arrays.toString(classification(new int[]{2, 9, 3, 5, 7, 4, 4}))); //  [1, 6, 2, 4, 5, 3, 3]
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int[] classification(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, map.size() + 1);
            }
        }

        for(int i = 0; i < nums.length; i++){
            sorted[i] = map.get(nums[i]);
        }

        return sorted;
    }
}
