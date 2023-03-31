package heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class UniqueAdjacents {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(updateProductIds(new int[]{1, 1, 2, 2}))); // return [1, 2, 1, 2] (the ones are separated by the twos. Note [2, 1, 2, 1] is also an acceptable answer).
        System.out.println(Arrays.toString(updateProductIds(new int[]{4, 1, 3, 3, 2}))); //  return [3, 1, 3, 2, 4].
    }

    // Runtime: O(NlogN) where N is the total number of elements in ids.
    // Space complexity: O(N) where N is the total number of elements in ids.
    public static int[] updateProductIds(int[] ids) {
        Map<Integer, Integer> counts = new HashMap();
        for (int id: ids) {
            counts.put(id, counts.getOrDefault(id, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        heap.addAll(counts.keySet());

        int index = 0;
        while (!heap.isEmpty()) {
            int id = heap.poll();
            int count = counts.get(id);
            for (int i = 0; i < count; i++) {
                if (index >= ids.length) {
                    index = 1;
                }
                ids[index] = id;
                index += 2;
            }
        }

        return ids;
    }
}
