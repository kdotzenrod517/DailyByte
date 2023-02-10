package Lists;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerElements(new int[]{1, 3}))); // return [0, 1] (1 has 0 elements smaller than it and 3 has 1 element smaller than it).
        System.out.println(Arrays.toString(smallerElements(new int[]{4, 2, 9, 10, 3}))); // [2, 0, 3, 4, 1].
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int[] smallerElements(int[] nums){
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> counts = new HashMap<>();

        for(int i = 0; i < sorted.length; i++){
            counts.putIfAbsent(sorted[i], i);
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = counts.get(nums[i]);
        }

        return result;
    }
}
