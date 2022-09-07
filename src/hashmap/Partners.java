package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Partners {

    public static void main(String[] args){
        // 5 (index 0) and 5 (index 1) are partners.
        // 1 (index 3) and 1 (index 4) are partners.
        // 3 (index 2) and 3 (index 5) are partners.
        // 3 (index 2) and 3 (index 6) are partners.
        // 3 (index 5) and 3 (index 6) are partners.
        System.out.println(numPartners(new int[]{5, 5, 3, 1, 1, 3, 3})); // 5
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int numPartners(int[] nums){

        Map<Integer, Integer> seen = new HashMap<>();
        int goodPairs = 0;

        for(int i : nums){
            if(seen.containsKey(i)){
                goodPairs += seen.get(i);
            }

            seen.put(i, seen.getOrDefault(i, 0) + 1);
        }

        return goodPairs;
    }
}
