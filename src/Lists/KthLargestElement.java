package Lists;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args){
        System.out.println(kthLargest(new int[]{1, 2, 3}, 1)); // 3
        System.out.println(kthLargest(new int[]{9, 2, 1, 7, 3, 2}, 5)); // 2
    }

    // Runtime: O(NlogN) where N is the total number of elements in nums (our optimization will help us knock the average case down to O(Nlogk) but in the worse case if k is equal to N our runtime degrades back to O(NlogN).
    // Space complexity: O(N). This results from storing all N elements in our heap in the worst case (i.e. when k is equal to N).
    public static int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int num: nums) {
            if(minHeap.size() < k) {
                minHeap.add(num);
            } else if(num > minHeap.peek()) {
                minHeap.remove();
                minHeap.add(num);
            }
        }

        return minHeap.remove();
    }
}
