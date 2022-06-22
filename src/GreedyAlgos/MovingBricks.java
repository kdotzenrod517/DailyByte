package GreedyAlgos;

import java.util.Arrays;

public class MovingBricks {

    public static void main(String[] args) {
        int[] bricks1 = {1000, 1000, 1000, 2000};
        int[] bricks2 = {1000, 200, 150, 200};

        System.out.println(movingBricks(bricks1)); // 3
        System.out.println(movingBricks(bricks2)); // 4
    }

    private static int movingBricks(int[] bricks) {
        Arrays.sort(bricks);
        int count = 0;
        int weight = 0;
        // Runtime: O(NlogN) where N is the total number of bricks we are given. This results from sorting our array.
        // Space complexity: O(1) or constant as the memory we use to solve our problem does not increase as our number of bricks increases.
        for (int i = 0; i < bricks.length; i++) {
            if (weight + bricks[i] < 5000) {
                count++;
                weight += bricks[i];
            } else {
                return count;
            }
        }

        return count;
    }
}
