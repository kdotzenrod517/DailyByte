package graphs;

import java.util.Arrays;

public class RubiksCube {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rubiksCubes(new int[][]{
                {1, 0},
                {0, 1},
                {1, 1}
        }))); //  [[1,0],[0,1],[0,0]]
    }

    // Runtime: O(N) where N is the total number of elements in cube.
    // Space complexity: O(1) or constant.
    public static int[][] rubiksCubes(int[][] cube) {
        for (int[] row : cube) {
            for (int i = 0; i < (cube[0].length + 1) / 2; ++i) {
                int temp = row[i] ^ 1;
                row[i] = row[cube[0].length - 1 - i] ^ 1;
                row[cube[0].length - 1 - i] = temp;
            }
        }
        return cube;
    }
}
