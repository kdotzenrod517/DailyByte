package DFS;

public class LargestIsland {

    public static void main(String[] args){
        System.out.println(largestIsland(new int[][] {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1},
        })); // 4
    }

    // Runtime: O(N) where N is the total number of cells in grid.
    // Space complexity: O(N) where N is the total number of cells in grid. This results from our recursion.
    public static int largestIsland(int[][] grid){
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, dfs(i, j, grid));
                }
            }
        }
        return max;
    }

    public static int dfs(int i, int j, int[][] grid){
       if(i < 0|| i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0){
           return 0;
       }

        grid[i][j] = 0; // mark as visited
        int count = 1;

        count += dfs(i + 1, j, grid);
        count += dfs(i - 1, j, grid);
        count += dfs(i, j + 1, grid);
        count += dfs(i, j - 1 , grid);

        return count;
    }
}
