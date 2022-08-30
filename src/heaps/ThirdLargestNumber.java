package heaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class ThirdLargestNumber {

    public static void main(String[] args){
        System.out.println(thirdLargest(new int[]{1, 4, 2, 3, 5})); // 3
        System.out.println(thirdLargest(new int[]{2, 3, 3, 5})); // 2
        System.out.println(thirdLargest(new int[]{9, 5})); // 9
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int thirdLargest(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) {
            if(!set.contains(i)) {
                heap.add(i);
                set.add(i);
                if(heap.size() > 3) {
                    set.remove(heap.remove());
                }
            }
        }

        if(heap.size() < 3) {
            while (heap.size() > 1) {
                heap.remove();
            }
        }

        return heap.peek();
    }
}
