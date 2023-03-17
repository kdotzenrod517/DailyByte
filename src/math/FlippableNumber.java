package math;

import java.util.HashMap;
import java.util.Map;

public class FlippableNumber {

    // Runtime: O(5M) where M is the total number of digits in N.
    // Space complexity: O(M) where M is the total number of digits in N.
    public int confusingNumberII(int N) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);
        int[] count = new int[1];
        countFlippable(N, 0, map, count);

        return count[0];
    }

    private void countFlippable(int N, long current, Map<Integer, Integer> map, int[] count) {
        if (isFlippable(current, map)) {
            count[0]++;
        }

        for (int i: map.keySet()) {
            if (current * 10 + i <= N && current * 10 + i != 0) {
                countFlippable(N, current * 10 + i, map, count);
            }
        }
    }

    private boolean isFlippable(long current, Map<Integer, Integer> map) {
        long original = current;
        long flipped = 0;
        while (current > 0) {
            flipped = flipped * 10 + map.get((int) current % 10);
            current /= 10;
        }

        return flipped != original;
    }
}
