package Lists;

import java.util.HashMap;
import java.util.HashSet;

public class LuckyNumber {

    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[]{1, 2, 1})); // 2
        System.out.println(luckyNumbers(new int[]{1, 3, 1, 2, 2})); // 3
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N)
    public static int luckyNumbers(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return set.iterator().next();
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public int singleNumber(int[] nums) {
        int lucky = 0;
        for (int num: nums) {
            lucky ^= num;
        }

        return lucky;
    }
}
