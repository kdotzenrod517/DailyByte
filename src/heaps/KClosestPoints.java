package heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {

    public static void main(String[] args){
        System.out.println(Arrays.deepToString(closePoints(new int[][]{{1, 1}, {-2, -2}}, 1))); // [[1, 1,]]
    }

    // Runtime: O(NlogN) where N is the total number of points we’re given.
    // Space complexity: O(N) where N is the total number of points we’re given.
    public static int[][] closePoints(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for(int[] point: points) {
            maxHeap.add(point);
            if(maxHeap.size() > K) {
                maxHeap.remove();
            }
        }

        int[][] kClosest = new int[K][2];
        while(K-- > 0) {
            kClosest[K] = maxHeap.remove();
        }

        return kClosest;
    }

}
