package Lists;

import java.util.*;

public class LeastUniqueElements {

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public int leastUniqueElements(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap();
        for (int num: nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Integer> sorted = new ArrayList(counts.keySet());
        Collections.sort(sorted, (a, b) -> counts.get(a) - counts.get(b));
        int removed = 0;
        int index = 0;
        while (k > 0) {
            k -= counts.get(sorted.get(index++));
            if (k >= 0) {
                removed++;
            }
        }

        return counts.size() - removed;
    }
}
