package heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BitAscending {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bitAscending(new int[]{5, 2, 8}))); // [2, 8, 5] (2 has 1 one bit, 8 has 1 one bit, 5 has 2 one bits).
        System.out.println(Arrays.toString(bitAscending(new int[]{4, 5, 5, 1, 3, 9}))); //  [1, 4, 3, 5, 5, 9].
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int[] bitAscending(int[] nums){

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                Comparator.comparing(Integer::bitCount).thenComparingInt(n -> n));

        for(int num : nums){
            heap.add(num);
        }

        int index = 0;
        while(!heap.isEmpty()){
            nums[index++] = heap.remove();
        }

        return nums;
    }
}
