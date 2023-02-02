package heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ValueSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(valueSort(new int[]{1, 1, 2, 3}))); // return [3, 2, 1, 1] (3 appears once and 2 appears once so 3 comes before 2 because it has a larger value, 1 appears twice so it at the end of our array).
        System.out.println(Arrays.toString(valueSort(new int[]{5, 2, 4, 4, 9, 2, 2}))); // 9,5,4,4,2,2,2
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int[] valueSort(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i ,0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            if(map.get(a) < map.get(b)){
                return -1;
            } else if (map.get(a) > map.get(b)){
                return 1;
            } else {
               return b - a;
            }
        });

        for(int i : nums){
            heap.add(i);
        }

        int[] sorted = new int[nums.length];
        int i = 0;
        while(!heap.isEmpty()){
            sorted[i++] = heap.remove();
        }

        return sorted;
    }
}
