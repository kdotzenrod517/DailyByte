package GreedyAlgos;

import java.util.PriorityQueue;

public class CombineMagnets {

    public static void main(String[] args){
        System.out.println(combineMagnets(new int[]{1, 2, 3})); // 9
        // (add 1 and 2 together for a cost of 3, add 3 and 3 together for a total cost of 6,
        // summing these costs together we get 9).
        System.out.println(combineMagnets(new int[]{5, 2, 4, 1})); // 22
    }

    // Runtime: O(NlogN) where N is the total number of elements in magnets.
    // Space complexity: O(N) where N is the total number of elements in magnets.
    public static int combineMagnets(int[] magnets){
        int total = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int magnet : magnets){
            heap.add(magnet);
        }

        while(heap.size() > 1){
            int first = heap.remove();
            int second = heap.remove();

            int sum = first + second;
            total += sum;

            heap.add(sum);
        }

        return total;
    }

}
