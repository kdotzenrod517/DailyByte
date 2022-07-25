package dynamicProgramming;

public class MinimizePath {

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{
                {1, 1, 3},
                {2, 3, 1},
                {4, 6, 1}
        })); // return 7, The path that minimizes our cost is 1->1->3->1->1 which sums to 7.
    }

    // Runtime: O(N * M) where N is the total number of rows in grid and M
    // is the total number of columns in grid. This results from iterating through all the cells in grid.
    // Space complexity: O(1) or constant since we reuse our grid matrix as our dp array.
    public static int minPathSum(int[][] grid) {
        for(int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for(int i = 1; i < grid[0].length; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for(int i = 1; i < grid.length; i++) {
            for(int j = 1; j < grid[0].length; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}
