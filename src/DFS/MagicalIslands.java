package DFS;

import org.w3c.dom.ls.LSInput;

public class MagicalIslands {

    // You are given a two-dimensional matrix, grid,
    // containing only ones and zeroes where zeroes represent
    // land and ones represent water. An “island” is a group of one
    // or more contiguous zeroes connected four-directionally
    // (i.e. up, down, left and right). A magical island is an
    // island that is completely surrounded by water on all sides
    // four-directionally. Return the total number of magical islands in
    // the grid.
    public static void main(String[] args) {
        System.out.println(magicalIslands(new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        })); // 1
        System.out.println(magicalIslands(new int[][]{
                {1, 1, 1, 0},
                {1, 0, 1, 0},
                {1, 1, 1, 0}
        })); // return 1 (the island in the right-most column is not entirely surrounded by water to its right for example).
    }

    // Runtime: O(N) where N is the total number of elements in grid.
    // Space complexity: O(N) where N is the total number of elements in grid.
    public static int magicalIslands(int[][] grid){
      for(int i = 0; i < grid.length; i++){
          for(int j = 0; j < grid[i].length; j++){
              if(i == 0 || i == grid.length - 1 || j == 0 || j == grid[i].length - 1){
                  dfs(grid, i, j);
              }
          }
      }

      int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void dfs(int[][] grid, int x, int y){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 1)
            return;

        grid[x][y] = 1;
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
}
























