package heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DivideToKGroups {

    public static void main(String[] args) {
        System.out.println(divideToKGroups(new int[]{1, 2, 2, 1}, 2)); // return true ([1, 2] and [1, 2]).
        System.out.println(divideToKGroups(new int[]{1, 2, 3, 3}, 2)); // return false
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static boolean divideToKGroups(int[] nums, int k){
        if(nums.length % k != 0) return false;

        Map<Integer, Integer> counts = new HashMap<>();
        for(int i : nums){
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.addAll(counts.keySet());

        while(!heap.isEmpty()){
            int current = heap.remove();
            int count = counts.get(current);
            if(count > 0){
                for(int i = 1; i < k; i++){
                    if(!counts.containsKey(current + i) || counts.get(current + 1) < count){
                        return false;
                    }
                    counts.put(current + i, counts.get(current + i) - count);
                }
            }
        }

        return true;
    }
}
