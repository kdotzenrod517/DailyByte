package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubarraySumDivisibleByK {

    public static void main(String[] args) {
        System.out.println(kDivisible(new int[]{1, 3, 1, 2, 5}, 7)); // return 2 ([1, 3, 1, 2] and [2, 5] both sum to 7).
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(k).
    public static int kDivisible(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;
        for(int num : nums){
            sum = (num + sum) % k;
            if(sum < 0){
                sum += k;
            }

            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
