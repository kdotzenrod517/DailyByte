package heaps;

import java.util.PriorityQueue;

public class ConsecutiveValueGroupsSizeK {

    public static void main(String[] args) {
        System.out.println(consecutiveGroups(new int[]{2, 4, 1, 3}, 2)); // return true (the nums can be split into two groups [1, 2] and [3, 4]).
        System.out.println(consecutiveGroups(new int[]{5, 3, 10}, 3)); // false
    }

    // Runtime: O(k x NlogN) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    private static boolean consecutiveGroups(int[] nums, int k) {

       PriorityQueue<Integer> heap = new PriorityQueue<>();

       for(int i : nums){
           heap.add(i);
       }

       while(!heap.isEmpty()){
           int start = heap.remove();
           for(int i = 1; i < k; i++){
               if(!heap.remove(start + i)){
                   return false;
               }
           }
       }

        return true;
    }
}
