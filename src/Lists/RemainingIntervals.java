package Lists;

import java.util.Arrays;

public class RemainingIntervals {

    public static void main(String[] args) {
        System.out.println(remainingIntervals(new int[][]{
                {1, 2},
                {0, 4}
        })); // return 1 ([0, 4] is the only remaining interval).
        System.out.println(remainingIntervals(new int[][]{
                {8, 10},
                {4, 6},
                {1, 2}
        })); // 3
    }

    // Runtime: O(NlogN) where N is the total number of elements in intervals.
    // Space complexity: O(1) or constant.
    public static int remainingIntervals(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int remaining = 0;
        int start = -1;
        int end = -1;

        for(int[] interval : intervals){
            if(interval[0] > start && interval[1] > end){
                remaining++;
                start = interval[0];
            }
            end = Math.max(end, interval[1]);
        }

        return remaining;
    }
}
