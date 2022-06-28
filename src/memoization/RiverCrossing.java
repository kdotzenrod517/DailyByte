package memoization;

import java.util.Arrays;

public class RiverCrossing {

    // A frog is attempting to cross a river to reach the other side.
    // Within the river, there are stones located at different positions given by a stones array
    // (this array is in sorted order). Starting on the first stone (i.e. stones[0]),
    // the frog makes a jump of size one potentially landing on the next stone.
    // If the frog’s last jump was of size x, the frog’s next jump may be of size x - 1, x, or x + 1.
    // Given these following conditions return whether the frog can reach the other side.

    //Note: The frog may only jump in the forward direction.
    public static void main(String[] args){
        int[] stones = {0, 1, 10};
        System.out.println(canCross(stones)); // false, The frog can jump from stone 0 to stone 1,
        // but then the gap is too far to jump to the last stone (i.e. the stone at position 10)
        int[] stones1 = {0, 1, 2, 4};
        System.out.println(canCross(stones1)); // true, The frog can jump from stone 0, to stone 1, to stone 2, to stone 4.
    }

    // Runtime: O(N2) where N is the number of stones we’re given.
    // Space complexity: O(N2) where N is the number of stones we’re given (this results from our memoize matrix).
    public static boolean canCross(int[] stones) {
        int[][] memoize = new int[stones.length][stones.length];
        for (int[] ints : memoize) {
            Arrays.fill(ints, -1);
        }

        return canCross(stones, 0, 0, memoize) == 1;
    }

    public static int canCross(int[] stones, int start, int jump, int[][] memoize) {
        if (memoize[start][jump] > -1) {
            return memoize[start][jump];
        }

        for (int i = start + 1; i < stones.length; i++) {
            int nextPosition = stones[i] - stones[start];
            if (nextPosition >= jump - 1 && nextPosition <= jump + 1 && canCross(stones, i, nextPosition, memoize) == 1) {
                memoize[start][jump] = 1;
                return 1;
            }
        }

        memoize[start][jump] = (start == stones.length - 1) ? 1 : 0;
        return memoize[start][jump];
    }
}
