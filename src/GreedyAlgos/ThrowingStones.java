package GreedyAlgos;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ThrowingStones {

    public static void main(String[] args) {
        int[] stones1 = {2, 4, 3, 8};
        int[] stones2 = {1, 2, 3, 4};
        System.out.println(throwingStones(stones1)); // 1
        System.out.println(throwingStones(stones2)); // 0
    }

    public static int throwingStones(int[] stones) {

        Queue<Integer> heap = new PriorityQueue<>(stones.length, Comparator.reverseOrder());

        for(int stone : stones){
            heap.add(stone);
        }

        while (heap.size() >= 2) {
            int x = heap.poll();
            int y = heap.poll();
            if (x > y) {
                heap.add(x - y);
            }
        }

        return heap.isEmpty() ? 0 : heap.peek();
    }
}
