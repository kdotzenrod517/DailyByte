package heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AdultSupervision {

    // To solve this problem, we can leverage two things, first a heap and second a binary search. We can create a heap that will store at most k elements and will store the total number of ones (i.e. number of adults) in each row and the row’s corresponding index in matrix. For every row within our matrix, we can leverage a binary search to quickly determine the total number of ones that occur. Once we’ve iterated through every row in our matrix populating our heap, we can remove our k elements from our heap placing their row index into a return array.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(adultSupervision(new int[][]{
                {1, 1, 0},
                {1, 0, 0},
                {0, 0, 0}
        }, 3))); // return [2, 1, 0] (row 2 has least adults followed by row 1 and row 0).
        System.out.println(Arrays.toString(adultSupervision(new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 0}
        }, 2))); // return [2, 1]
    }

    // Runtime: O(NlogM) where N is the total number of rows in our
    // matrix and M is the total number of elements in each row.
    // Space complexity: O(k).
    public static int[] adultSupervision(int[][] matrix, int k) {
        int[] sorted = new int[k];
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) ->
            a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]
        );

        for(int i = 0; i < matrix.length; i++){
            heap.add(new int[] { binarySearch(matrix[i]), i});
            if(heap.size() > k){
                heap.remove();
            }
        }

        while(k > 0){
            sorted[--k] = heap.remove()[1];
        }

        return sorted;
    }

    public static int binarySearch(int[] row){
        int left = 0;
        int right = row.length;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(row[mid] == 1){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}
